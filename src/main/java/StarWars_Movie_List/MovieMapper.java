package StarWars_Movie_List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper

public interface MovieMapper {
    @Select("SELECT * FROM movieList INNER JOIN directorList  ON movie_id=director_id")
    List<Movies> findAll();

    @Select("SELECT movieName,releaseDate FROM movieList WHERE movie_id = #{id}")
    List<MoviesTitle> findById(int id);
}
