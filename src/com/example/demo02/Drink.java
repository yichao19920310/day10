package com.example.demo02;

public abstract class Drink {
	private String name;
	public Drink(String name) {
		this.name = name;
	}
	public Drink() {
		
	}
	public abstract void make();
}
