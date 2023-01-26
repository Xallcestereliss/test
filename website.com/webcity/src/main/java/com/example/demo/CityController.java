package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

	Repository rep = new Repository();
	
	@GetMapping("/city")
public City city(@RequestParam(value="name", required=true) String name ) {
	return rep.cityByName(name);
}
	@PostMapping("/city")
	public City cityUpdate(
			@RequestParam(value="name", required=true)String name, 
			@RequestParam(value="population", required=true)int population,
			@RequestParam(value="id", required=true)int id,
	        @RequestParam(value="landmark", required=true)String landmark)
	{
		City p = rep.cityByName(name);
		if(p != null) {
			p.setPopulation(population);
			return p;
		}
		else
			return rep.addCity(new City(name, population, id, landmark));
	}
}
