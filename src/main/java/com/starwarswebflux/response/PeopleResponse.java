package com.starwarswebflux.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PeopleResponse {

  private String birth_year;
  private String eye_color;
  private List<String> films;
  private String gender;
  private String homeworld;
  private String name;
  private List<String> species;
  private List <String> starships;
  private List<String> vehicles;
  
}
