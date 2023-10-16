package StarWars_Movie_List.entity;

public class Movie {
    private int movieId;
    private String movieName;
    private String releaseDate;

    private int directorId;
    private String directorName;

    public Movie(Object object1, String movieName, String releaseDate, Object object2, String directorName) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.directorId = directorId;
        this.directorName = directorName;
    }

    public int getMovie_id() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int Director_id() {
        return directorId;
    }

    public String getDirectorName() {
        return directorName;
    }
}
