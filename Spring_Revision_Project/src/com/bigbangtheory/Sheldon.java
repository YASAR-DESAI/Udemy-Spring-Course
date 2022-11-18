package com.bigbangtheory;

public class Sheldon implements Character {
	
	int id = 2 ;
	String name = "Sheldon Cooper";
	String job = "Theoretical Physicist" ;
	String characteristic = "Genius but Annoying ;)";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return job;
	}

	@Override
	public String getCharacteristic() {
		// TODO Auto-generated method stub
		return characteristic;
	}

	@Override
	public int getCharacterId() {
		// TODO Auto-generated method stub
		return id;
	}

}
