package StarWars_Movie_List.service;

import StarWars_Movie_List.MovieNotFoundException;
import StarWars_Movie_List.entity.Movie;
import StarWars_Movie_List.mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public Movie getMovie(int id) {
        Optional<Movie> movie = this.movieMapper.findById(id);
        //return this.movieMapper.findById(id).orElseThrow(() -> new MovieNotFoundException("movie not found"));
        //}
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new MovieNotFoundException("movie not found");
        }
    }

    public List<Movie> getDirector(String directorName) {
        List<Movie> movieOfDirector = movieMapper.findDirectorName(directorName);
        return movieOfDirector;
    }

}

