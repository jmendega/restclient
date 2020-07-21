package com.springboot.restclient.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.restclient.json.JokeResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j 
public class JokeService {
  
    private RestTemplate restTemplate;
    private final static String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";
    
  JokeService (RestTemplateBuilder template){
    
    restTemplate = template.build();
  }
  
  public String getJoke(String first, String last ) {
    
    String url = String.format("%s&firstName=%s&lastName=%s", BASE, first, last);
    JokeResponse jokeResponse = restTemplate.getForObject(url, JokeResponse.class);
    
    log.info(jokeResponse.getValue().getJoke());
    
    return jokeResponse.getValue().getJoke(); 
  }

}
