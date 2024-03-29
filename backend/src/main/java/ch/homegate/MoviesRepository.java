package ch.homegate;

import ch.homegate.beans.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MoviesRepository extends MongoRepository<Movie, String> {

    List<Movie> findByTitle(@Param("title") String title);
    List<Movie> findByMainActor(@Param("name") String name);
    List<Movie> findByCategory(@Param("category") String category);
    List<Movie> findByReleaseDate(@Param("releaseDate") Date releaseDate);

}