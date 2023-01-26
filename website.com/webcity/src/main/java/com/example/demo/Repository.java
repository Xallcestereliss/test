package com.example.demo;

import java.util.Hashtable;
import java.util.Map;

public class Repository {

	static Map<String, City> city = new Hashtable<>();
	
	static {
		city.put("USA", new City( "Washington", 40000, 03, "White House. "
				+ "/n build 1 november 1800 years "
				+ "/n Adres: 1600 Pennsylvania Avenue NW, Washington, DC 20500."));
		city.put("Russia", new City( "Moscow", 361568, 02, "Kreml. "
				+ "/n build 1495 years "
				+ "/n Adres: Moscow, Red Palace"));
		city.put("Germany", new City( "Berlin", 723000, 01, "Branderburg Gate. "
				+ "/n build 6 august 1979 years "
				+ "/n Adres:Pariser Platz, 10117 Berlin"));
	}
	
	public City cityByName(String name) {
		return city.get(name);
	}
	
	public City addCity(City p) {
		city.put(p.getName(), p);
		return p;
	}
}
