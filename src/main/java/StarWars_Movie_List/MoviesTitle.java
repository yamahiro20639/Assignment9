package StarWars_Movie_List;

public class MoviesTitle {
    private String movieName;
    private String releaseDate;

    public MoviesTitle(String movieName, String releaseDate) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
