package io.javaBrains.moviecatalogservice.controller;

import io.javaBrains.moviecatalogservice.model.CatalogItem;
import io.javaBrains.moviecatalogservice.model.Movie;
import io.javaBrains.moviecatalogservice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;
    
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){

        UserRating ratings = restTemplate.getForObject("http://localhost:8082/ratingsData/users/" + userId, UserRating.class);

        RestTemplate restTemplate = new RestTemplate();

//        List<Rating> ratings = Arrays.asList(
//                new Rating("1243",4),
//                new Rating("2342",6)
//        );

        return ratings.getUserRating().stream().map(rating -> {

            //For each movie ID, call movie info service and get details
            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/qwe" + rating.getMovieId(), Movie.class);

            // Chaining mechanism ( This is the second method )

//            Movie movie = webClientBuilder.build()  // using a builder pattern and giving  you a client
//                    .get()  //  says I am gone a do get
//                    .uri("http://localhost:8081/movies/qwe" + rating.getMovieId())  //  The uri that you need to be access
//                    .retrieve()     //  go to the fetch
//                    .bodyToMono(Movie.class)    // is basically says that whatever body you get back that converted into a movie class ( you are getting an asynchronous object it is in the future going to giving you what you want)
//                    .block();   //  moving object

            //Put item all together
            return new CatalogItem(movie.getName(),"test",rating.getRating());
        }).collect(Collectors.toList());



//        return Collections.singletonList(
//                new CatalogItem("Titanic","Testing",4)
//        );
    }
}
