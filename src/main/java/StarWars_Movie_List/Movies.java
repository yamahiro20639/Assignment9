package StarWars_Movie_List;

public class Movies {
    private int movie_id;
    private String movieName;
    private String releaseDate;

    private int director_id;
    private String director;

    public Movies(int movie_id, String movieName, String releaseDate, int director_id, String director) {
        this.movie_id = movie_id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.director_id = director_id;
        this.director = director;

    }

    public int getMovie_id() {
        return movie_id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int Director_id() {
        return director_id;
    }

    public String getDirector() {
        return director;
    }
}
