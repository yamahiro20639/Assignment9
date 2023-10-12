package StarWars_Movie_List.mapper;

import StarWars_Movie_List.entity.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface MovieMapper {


    @Select("SELECT * FROM movieList INNER JOIN directorList  ON movie_id=director_id")
    List<Movies> findAll();

    @Select("SELECT * FROM movieList, directorList WHERE movie_id = #{id} AND director_id= #{id} ")
    List<Movies> findById(int id);

    @Select("SELECT * FROM  directorList INNER JOIN movieList ON movie_id=director_id WHERE director LIKE CONCAT('%', #{directorName}, '%') ")
    List<Movies> findDirectorName(String directorName);
}
//movieName,releaseDate