package StarWars_Movie_List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
