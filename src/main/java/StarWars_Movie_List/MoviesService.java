package StarWars_Movie_List;

import org.springframework.stereotype.Service;

import java.util.List;

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

}

