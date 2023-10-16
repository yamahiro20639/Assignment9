package StarWars_Movie_List.entity;

public class Movie {
    private int movieId;
    private String movieName;
    private String releaseDate;

    private int directorId;
    private String director;

    public Movie(Object object1, String movieName, String releaseDate, Object object2, String director) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.directorId = directorId;
        this.director = director;
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

    public void setDirector(String director) {
        this.director = director;
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
        return director;
    }
}
