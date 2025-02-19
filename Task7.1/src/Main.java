import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Tenet", 7.4, 2020));
        movies.add(new Movie("Dunkirk", 7.9, 2017));

        System.out.println("Before Sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies);

        System.out.println("\nAfter Sorting by Year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
