package StarWars_Movie_List.controller;

import StarWars_Movie_List.MovieNotFoundException;
import StarWars_Movie_List.entity.Movie;
import StarWars_Movie_List.service.MoviesService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class MoviesController {

    private MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {

        this.moviesService = moviesService;
    }

    @GetMapping("/star-wars")
    public List<Movie> getMovies() {
        List<Movie> movies = moviesService.getMovies();
        return movies;
    }

    @GetMapping("/star-wars/{id}")
    public Movie getMovieTitle(@PathVariable("id") int id) {
        Movie movie = moviesService.getMovie(id);
        return movie;
    }

    @GetMapping("/star-wars-movie")
    public List<Movie> getMovieTitle(@RequestParam("directorName") String directorName) {
        List<Movie> movieOfDirector = moviesService.getDirector(directorName);
        return movieOfDirector;
    }

    @ExceptionHandler(value = MovieNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleUserNotFoundException(
            MovieNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
