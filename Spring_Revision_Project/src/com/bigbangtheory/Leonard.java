package com.bigbangtheory;

public class Leonard implements Character {
	
	int id = 1 ;
	String name = "Leonard";
	String job = "Experimental Physicist" ;
	String characteristic = "Understanding and Caring but Insecure ;)";

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
