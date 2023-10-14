package StarWars_Movie_List.controller;

import StarWars_Movie_List.entity.Movie;
import StarWars_Movie_List.service.MoviesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Movie> getMovieTitle(@PathVariable("id") int id) {
        List<Movie> moviesTitle = moviesService.getMoviesTitle(id);
        return moviesTitle;
    }

    @GetMapping("/star-wars-movie")
    public List<Movie> getMovieTitle(@RequestParam("directorName") String directorName) {
        List<Movie> moviesTitle = moviesService.getDirector(directorName);
        return moviesTitle;
    }

}
