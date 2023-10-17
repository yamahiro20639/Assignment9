package StarWars_Movie_List.controller;

import StarWars_Movie_List.Form.MovieForm;
import StarWars_Movie_List.Form.MovieUpdateForm;
import StarWars_Movie_List.MovieDuplicationException;
import StarWars_Movie_List.MovieNotFoundException;
import StarWars_Movie_List.MovieRegistrationResponse;
import StarWars_Movie_List.MovieUpdateResponse;
import StarWars_Movie_List.entity.Movie;
import StarWars_Movie_List.service.MoviesService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class MoviesController {

    private MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {

        this.moviesService = moviesService;
    }

    //GET
    @GetMapping("/star-wars")
    public List<Movie> getMovies() {
        List<Movie> movies = moviesService.getMovies();
        return movies;
    }

    @GetMapping("/star-wars/{id}")
    public ResponseEntity<Movie> getMovieTitle(@PathVariable("id") int id) {
        Movie movie = moviesService.getMovie(id);
        return ResponseEntity.ok(movie); //.ok() ステータスコード200を表す
    }

    @GetMapping("/star-wars-movie")
    public List<Movie> getMovieTitle(@RequestParam("directorName") String directorName) {
        List<Movie> movieOfDirector = moviesService.getDirectorName(directorName);
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
    //POST

    // @PostMapping("/movie-registration-form")
    //public ResponseEntity<MovieRegistrationResponse> movieRegistration(@RequestBody MovieForm movieForm, UriComponentsBuilder uriBuilder) {
    //Movie movie = moviesService.insert(movieForm.getMovieName(), movieForm.getReleaseDate(), movieForm.getDirectorName());
    //URI location = uriBuilder.path("/movie-registration-form/{id}").buildAndExpand(movie.getMovie_id()).toUri();
    // MovieRegistrationResponse message = new MovieRegistrationResponse("Movie created");
    // return ResponseEntity.created(location).body(message); //.created(location)はステータスコード201を返す
    // }

    @ExceptionHandler(value = MovieDuplicationException.class)
    public ResponseEntity<Map<String, String>> handleDuplicationException(
            MovieDuplicationException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.CONFLICT.value()),
                "error", HttpStatus.CONFLICT.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity(body, HttpStatus.CONFLICT);
    }

    //PATCH
    @PatchMapping("/movie-update/{id}")
    public ResponseEntity<MovieUpdateResponse> movieUpdate(@PathVariable("id") int id, @RequestBody MovieUpdateForm movieUpdateForm) {
        MovieUpdateResponse movieUpdateResponse = new MovieUpdateResponse("Movie updated");
        Movie movie = moviesService.updateMovie(id, movieUpdateForm.getMovieName(), movieUpdateForm.getReleaseDate(), movieUpdateForm.getDirectorName());
        return ResponseEntity.ok(movieUpdateResponse);
    }

}
