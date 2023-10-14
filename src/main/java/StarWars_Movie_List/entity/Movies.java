package StarWars_Movie_List.entity;

public class Movies {
    private int movie_id;
    private String movieName;
    private String releaseDate;

    private int director_id;
    private String director;

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
