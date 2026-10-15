package com.streamora.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MovieController {

    private final List<Movie> movies = Arrays.asList(
        new Movie(
            1,
            "Galaxy Unknown",
            "Science Fiction",
            "Curious",
            "Explore mysterious worlds beyond Earth.",
            "Movie",
            20
        ),
        new Movie(
            2,
            "The Hidden Clue",
            "Mystery",
            "Excited",
            "Solve a mysterious case with unexpected clues.",
            "Interactive Story",
            30
        ),
        new Movie(
            3,
            "Ocean of Dreams",
            "Adventure",
            "Happy",
            "Discover a beautiful world beneath the ocean.",
            "Movie",
            15
        ),
        new Movie(
            4,
            "Mind Lab",
            "Knowledge",
            "Curious",
            "Explore science through interesting challenges.",
            "Quiz",
            50
        ),
        new Movie(
            5,
            "The Last Signal",
            "Thriller",
            "Excited",
            "A strange signal changes everything.",
            "Interactive Story",
            40
        )
    );

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }

    @GetMapping("/movies/mood/{mood}")
    public List<Movie> getMoviesByMood(@PathVariable String mood) {
        return movies.stream()
            .filter(movie ->
                movie.getMood().equalsIgnoreCase(mood))
            .toList();
    }

    @GetMapping("/plans")
    public List<Subscription> getPlans() {
        return Arrays.asList(
            new Subscription(
                "Free Explorer", 0,
                "Basic content and daily challenges"
            ),
            new Subscription(
                "Creator Plus", 199,
                "Premium stories and bonus challenges"
            ),
            new Subscription(
                "Family Universe", 399,
                "Family profiles and shared benefits"
            )
        );
    }
}
