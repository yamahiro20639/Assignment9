package StarWars_Movie_List;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    public final MovieMapper movieMapper;

    public MoviesService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movies> getMovies() {

        List<Movies> movies = movieMapper.findAll();
        return movies;
    }

    public List<Movies> getMoviesTitle(int id) {
        List<Movies> moviesTitle = movieMapper.findById(id);
        return moviesTitle;
    }

}

