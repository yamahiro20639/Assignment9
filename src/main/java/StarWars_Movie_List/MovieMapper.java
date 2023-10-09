package StarWars_Movie_List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface MovieMapper {
    @Select("SELECT * FROM movieName INNER JOIN director ON movie_id=director_id")
    List<Movies> findAll();
}
