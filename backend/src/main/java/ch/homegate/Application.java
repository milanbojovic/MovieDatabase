package ch.homegate;

import ch.homegate.beans.Movie;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    MoviesRepository movieRepo;

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("Importing data to mongodb");

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        movieRepo.save(new Movie("MV001", "Shawshank Redemption", "Drama", "Tim Robbins", df.parse("14/10/1994")));
        movieRepo.save(new Movie("MV002", "The Godfather I", "Crime, Drama", "Marlon Brando", df.parse("24/03/1972")));
        movieRepo.save(new Movie("MV003", "The Godfather II", "Drama", "Marlon Brando", df.parse("20/12/1974")));
    }
}