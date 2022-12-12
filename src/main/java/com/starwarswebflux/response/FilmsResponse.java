package com.starwarswebflux.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FilmsResponse {

  private List<String> characters;
  private String director;
  private String episode_id;
  private String opening_crawl;
  private String title;
  
}
