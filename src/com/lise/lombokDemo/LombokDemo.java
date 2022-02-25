package com.lise.lombokDemo;

import lombok.Setter;
import lombok.ToString;

//@Data

@ToString
public class LombokDemo {

	private @Setter String name;
	private @Setter int age;
	private int id;
	
}
