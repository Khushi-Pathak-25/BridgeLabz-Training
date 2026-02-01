package com.streams.streamsapi;

import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    //Creating Constructor
    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {

        //List of movies
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Avatar", 7.9, 2009),
            new Movie("Avengers", 8.4, 2019),
            new Movie("Joker", 8.5, 2019),
            new Movie("Tenet", 7.5, 2020),
            new Movie("Oppenheimer", 8.9, 2023)
        );

        // Stream processing
        movies.stream()
              // Filter movies released after 2010
              .filter(movie -> movie.getYear() > 2010)

              // Sort movies by rating (descending order)
              .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))

              // Step 3: Take top 5 movies
              .limit(5)

              // Print movie name and rating
              .forEach(movie ->
                  System.out.println(movie.getName() + " - Rating: " + movie.getRating())
              );
    }
}
