package StarWars_Movie_List.mapper;

import StarWars_Movie_List.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface MovieMapper {


    @Select("SELECT * FROM movie_list INNER JOIN director_list  ON movie_id=director_id")
    List<Movie> findAll();

    @Select("SELECT * FROM movie_list, director_list WHERE movie_id = #{id} AND director_id= #{id} ")
    List<Movie> findById(int id);

    @Select("SELECT * FROM  director_list INNER JOIN movie_list ON movie_id=director_id WHERE director LIKE CONCAT('%', #{directorName}, '%') ")
    List<Movie> findDirectorName(String directorName);
}
//movieName,releaseDate