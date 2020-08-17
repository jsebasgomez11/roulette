package com.init.products.entitys;

import java.lang.reflect.Array;


public class Roulette {
	
	/**
	 * roulette features
	 */
	private double id;
	private String name;	
	private String colour1;
	private String colour2;
	private String condition;
		
	public Roulette() {
		super();
	}
	
	public Roulette(String condition) {
		super();
		this.condition = condition;
	}

	public Roulette( String name, String colour1, String colour2, String condition) {
		super();
		
		this.name = name;
		this.colour1 = colour1;
		this.colour2 = colour2;
		this.condition = condition;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour1() {
		return colour1;
	}
	public void setColour1(String colour1) {
		this.colour1 = colour1;
	}
	public String getColour2() {
		return colour2;
	}
	public void setColour2(String colour2) {
		this.colour2 = colour2;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
