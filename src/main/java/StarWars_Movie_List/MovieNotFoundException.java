package StarWars_Movie_List;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message) {

        super(message);
    }
}
