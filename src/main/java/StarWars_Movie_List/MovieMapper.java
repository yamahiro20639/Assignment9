package StarWars_Movie_List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper

public interface MovieMapper {


    @Select("SELECT * FROM movieList INNER JOIN directorList  ON movie_id=director_id")
    List<Movies> findAll();

    @Select("SELECT * FROM movieList, directorList WHERE movie_id = #{id} AND director_id= #{id} ")
    List<Movies> findById(int id);


}
//movieName,releaseDate