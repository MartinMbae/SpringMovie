package com.sperry.moviecatalogservice.resource;

import com.sperry.moviecatalogservice.model.Movie;
import com.sperry.moviecatalogservice.model.MovieInfo;
import com.sperry.moviecatalogservice.model.Rating;
import com.sperry.moviecatalogservice.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieResource {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/{user_id}")
    public List<Movie> getMovies(@PathVariable("user_id") int user_id) {

        UserRatings userRatings = restTemplate.getForObject("http://rating-data-service/ratings/users/"+user_id, UserRatings.class);

        return userRatings.getUserRatings().stream().map(rating -> {
            MovieInfo movieInfo = restTemplate.getForObject("http://movie-info-service/movie-info/"+rating.getMovie_id(), MovieInfo.class);

//            MovieInfo movieInfo = webClientBuilder.build()
//                    .get()
//                    .uri("http://localhost:8081/movie-info/"+rating.getMovie_id())
//                    .retrieve()
//                    .bodyToMono(MovieInfo.class)
//                    .block();

            return new Movie(movieInfo.getId(), movieInfo.getName(), movieInfo.getDesc(), rating.getRatings());
                }
        ).collect(Collectors.toList());

    }


}
