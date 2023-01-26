package com.example.demo;

public class City {

	private String name;
	private int population;
	private final long id;
	private String Landmark;
	
	public City(String name, int population,long id, String Landmark) {
		super();
		this.name = name;
		this.population = population;
		this.id = id;
		this.Landmark = Landmark;
	}
	
		// TODO Auto-generated constructor stub

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	public long getId() {
		return id;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
}
