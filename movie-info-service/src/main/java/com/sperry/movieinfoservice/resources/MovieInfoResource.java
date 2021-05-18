package com.sperry.movieinfoservice.resources;


import com.sperry.movieinfoservice.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("movie-info")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public MovieInfo getInfo(@PathVariable("movieId") int movieId){

        return new  MovieInfo(movieId, "Spider", "Ssssss");
    }
}
