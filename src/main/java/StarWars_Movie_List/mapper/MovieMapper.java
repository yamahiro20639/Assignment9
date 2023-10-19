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
    //POST
    @Select("SELECT * FROM movie_list WHERE movie_name = #{movieName}")
    Object getByMovie(String movieName);

    @Select("SELECT * FROM movie_list WHERE  release_date = #{releaseDate}")
    Object getByReleaseDate(String releaseDate);

    @Insert("INSERT INTO movie_list (movie_name, release_date) VALUES (#{movieName}, #{releaseDate})")
    @Options(useGeneratedKeys = true, keyColumn = "movie_id", keyProperty = "movieId")
    void insertMovieList(Movie movie);

    @Select("SELECT * FROM director_list WHERE director_name = #{directorName}")
    Object getByDirector(String directorName);

    @Insert("INSERT INTO director_list (director_name) VALUES (#{directorName})")
    @Options(useGeneratedKeys = true, keyColumn = "director_id", keyProperty = "directorId")
    void insertDirectorList(Movie movie);

    //GET
    @Select("SELECT * FROM movie_list INNER JOIN director_list  ON movie_id=director_id")
    List<Movie> findAll();

    @Select("SELECT * FROM movie_list, director_list WHERE movie_id = #{id} AND director_id= #{id} ")
    Optional<Movie> findById(int id);

    @Select("SELECT * FROM  director_list INNER JOIN movie_list ON movie_id=director_id WHERE director_name LIKE CONCAT('%', #{directorName}, '%') ")
    List<Movie> findDirectorName(String directorName);


}
