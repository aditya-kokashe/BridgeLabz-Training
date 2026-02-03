package com.streamapi.top5movies;

import java.util.Arrays;
import java.util.List;

public class TopTrendingMoviesMain {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Interstellar", 8.6, 2014),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Avatar", 7.9, 2009),
                new Movie("Inception", 8.8, 2010),
                new Movie("Dune Part Two", 8.7, 2024),
                new Movie("Tenet", 7.8, 2020),
                new Movie("Oppenheimer", 8.9, 2023)
        );

        System.out.println("Top 5 Movies:");

        movies.stream()
                .filter(movie -> movie.getRating() >= 8.0)
                .sorted((m1, m2) -> {
                    int ratingCompare = Double.compare(m2.getRating(), m1.getRating());
                    return ratingCompare != 0
                            ? ratingCompare
                            : Integer.compare(m2.getReleaseYear(), m1.getReleaseYear());
                })
                .limit(5)
                .forEach(System.out::println);
    }
}
