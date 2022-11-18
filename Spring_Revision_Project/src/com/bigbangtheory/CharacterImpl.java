package com.bigbangtheory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CharacterImpl {

	
	public static void main(String[] args)
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Character person = context.getBean("sheldon",Character.class);
		
		System.out.println(person.getCharacterId());
		System.out.println(person.getName());
		System.out.println(person.getJob());
		System.out.println(person.getCharacteristic());
		
		context.close();	
		
	}

}
