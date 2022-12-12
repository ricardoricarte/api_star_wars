package com.starwarswebflux.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.starwarswebflux.client.FeignClient;
import com.starwarswebflux.response.PeopleResponse;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/reactive-feign")
public class StarWarsController {

  FeignClient feignClient;;

  @GetMapping("/person/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<PeopleResponse> findPersonById(@PathVariable String id) {
    return feignClient.getPeopleById(id);
  }

  @GetMapping("/movie/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<PeopleResponse> findMovieById(@PathVariable String id) {
    return feignClient.getPeopleById(id);
  }
}
