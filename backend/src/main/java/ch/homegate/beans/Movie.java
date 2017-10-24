package ch.homegate.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="movies")
public class Movie {

    @Id
    private String id;
    private String movieId;
    private String title;
    private String category;
    private String mainActor;
    @JsonFormat(pattern = "dd/mm/yyyy" )
    private Date releaseDate;

    //TODO Preview ICON !!!

    public Movie() {
    }

    public Movie(String movieId, String title, String category, String mainActor, Date releaseDate) {
        this.movieId = movieId;
        this.title = title;
        this.category = category;
        this.mainActor = mainActor;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
