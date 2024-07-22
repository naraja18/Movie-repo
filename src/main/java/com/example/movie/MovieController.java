package com.example.movie;

import org.springframework.*;
import java.util.*;
import com.example.movie.MovieService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    MovieService apiService = new MovieService();

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return apiService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovies(@RequestBody Movie movie) {
        return apiService.addMovies(movie);
    }

    @GetMapping("movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return apiService.getMovieById();
    }

    @PutMapping("movies/{movieId}")
    public Movie updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        return apiService.updateMovie(movieId, movie);
    }

    @DeleteMapping("mpovies/movieId")
    public void deleteMovie(@PathVariable("movieId") int movieId) {
        apiService.deleteMovie(movieId);
    }
}