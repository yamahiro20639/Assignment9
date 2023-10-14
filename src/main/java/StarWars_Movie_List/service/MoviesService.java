package StarWars_Movie_List.service;

import StarWars_Movie_List.entity.Movie;
import StarWars_Movie_List.mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    public final MovieMapper movieMapper;

    public MoviesService(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public List<Movie> getMovies() {

        List<Movie> movies = movieMapper.findAll();
        return movies;
    }

    public List<Movie> getMoviesTitle(int id) {
        List<Movie> moviesTitle = movieMapper.findById(id);
        return moviesTitle;
    }

    public List<Movie> getDirector(String directorName) {
        List<Movie> moviesTitle = movieMapper.findDirectorName(directorName);
        return moviesTitle;
    }

}

