package StarWars_Movie_List.entity;

public class Movie {
    private int id;
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

    public Movie(int id, String movieName, String releaseDate, String directorName) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.directorName = directorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public void setDirector(String directorName) {
        this.directorName = directorName;
    }

    public int getId() {
        return id;
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
