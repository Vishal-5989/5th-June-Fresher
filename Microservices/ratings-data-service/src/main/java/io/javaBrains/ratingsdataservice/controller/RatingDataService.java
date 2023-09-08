package io.javaBrains.ratingsdataservice.controller;

import io.javaBrains.ratingsdataservice.model.Rating;
import io.javaBrains.ratingsdataservice.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataService {
    @RequestMapping("movies/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1243",4),
                new Rating("2342",6)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
