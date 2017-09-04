package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping(value="/movies")
class MovieService {
 
   @RequestMapping(value="/{id}")
   public String getMovie(@PathVariable String id){
      String URL="http://localhost:8080/movies/" + id;
 
      RestTemplate template=new RestTemplate();
 
      Movie movie =template.getForObject(URL,Movie.class);
 
      return movie.toString();
   }

   @RequestMapping(value="/most_liked")
   public String getMostLikedMovie() {
      String URL="http://localhost:8080/movies/most_liked";

      RestTemplate template=new RestTemplate();

      Movie movie =template.getForObject(URL,Movie.class);

      return movie.toString();
   }
}