package StarWars_Movie_List.service;

import StarWars_Movie_List.entity.Movies;
import StarWars_Movie_List.mapper.MovieMapper;
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

    public List<Movies> getMoviesTitle(int id) {
        List<Movies> moviesTitle = movieMapper.findById(id);
        return moviesTitle;
    }

    public List<Movies> getDirector(String directorName) {
        List<Movies> moviesTitle = movieMapper.findDirectorName(directorName);
        return moviesTitle;
    }

}

