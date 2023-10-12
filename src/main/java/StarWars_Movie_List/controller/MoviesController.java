package StarWars_Movie_List.controller;

import StarWars_Movie_List.entity.Movies;
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

    @GetMapping("/StarWars")
    public List<Movies> getMovies() {
        List<Movies> movies = moviesService.getMovies();
        return movies;
    }

    @GetMapping("/StarWars/{id}")
    public List<Movies> getMovieTitle(@PathVariable("id") int id) {
        List<Movies> moviesTitle = moviesService.getMoviesTitle(id);
        return moviesTitle;
    }

    @GetMapping("/StarWarsMovie")
    public List<Movies> getMovieTitle(@RequestParam("directorName") String directorName) {
        List<Movies> moviesTitle = moviesService.getDirector(directorName);
        return moviesTitle;
    }

}
