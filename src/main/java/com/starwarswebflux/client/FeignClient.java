package com.starwarswebflux.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starwarswebflux.response.FilmsResponse;
import com.starwarswebflux.response.PeopleResponse;

import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(url = "https://swapi.dev/api/", name = "star-wars")
public interface FeignClient {

    @GetMapping("/people/{id}")
    Mono<PeopleResponse> getPeopleById(@RequestParam(value = "id") String id);

    @GetMapping("/films/{id}")
    Mono<FilmsResponse> getFilmById(@RequestParam(value = "id") String id);

}
