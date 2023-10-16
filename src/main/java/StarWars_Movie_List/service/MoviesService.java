package StarWars_Movie_List.service;

import StarWars_Movie_List.MovieNotFoundException;
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

    //GET
    public List<Movie> getMovies() {

        List<Movie> movies = movieMapper.findAll();
        return movies;
    }

    public Movie getMovie(int id) {
        return this.movieMapper.findById(id).orElseThrow(() -> new MovieNotFoundException("movie not found"));
    }


    public List<Movie> getDirectorName(String directorName) {
        List<Movie> movieOfDirector = movieMapper.findDirectorName(directorName);
        return movieOfDirector;
    }

    //POST
    public Movie insert(String movieName, String releaseDate, String directorName) {
        Movie movie = new Movie(null, movieName, releaseDate, null, directorName);
        movieMapper.insert(movie);
        return movie;
    }

}

