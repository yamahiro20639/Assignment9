package StarWars_Movie_List.mapper;

import StarWars_Movie_List.entity.Movie;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper

public interface MovieMapper {

    //GET
    @Select("SELECT * FROM movie_list INNER JOIN director_list  ON movie_id=director_id")
    List<Movie> findAll();

    @Select("SELECT * FROM movie_list, director_list WHERE movie_id = #{id} AND director_id= #{id} ")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM  director_list INNER JOIN movie_list ON movie_id=director_id WHERE director LIKE CONCAT('%', #{directorName}, '%') ")
    List<Movie> findDirectorName(String directorName);

    //POST
    @Insert("INSERT INTO movie_list (movie_name, release_date,director) VALUES (#{movieName}, #{releaseDate})")
    @Insert("INSERT INTO director_list (director) VALUES (#{directorName})")
    @Options(useGeneratedKeys = true, keyProperty = "movie_id")
    @Options(useGeneratedKeys = true, keyProperty = "director_id")
    void insert(Movie movie);
}
