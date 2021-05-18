package com.sperry.ratingdataservice.resources;


import com.sperry.ratingdataservice.models.Rating;
import com.sperry.ratingdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingResource {


    @RequestMapping("/{movie_id}")
    public Rating getRatings(@PathVariable("movie_id") String movie_id){
        return new Rating(1,2.0);
    }


    @RequestMapping("/users/{user_id}")
    public UserRatings getUserRatings(@PathVariable("user_id") String user_id){

        List<Rating> ratings = Arrays.asList(
                new Rating(1, 4),
                new Rating(2, 3)
        );

        return new UserRatings(ratings);
    }
}
