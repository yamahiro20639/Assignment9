package StarWars_Movie_List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    public List<MoviesTitle> getMovieTitle(@PathVariable("id") int id) {
        List<MoviesTitle> moviesTitle = moviesService.getMoviesTitle(id);
        return moviesTitle;
    }

}
