package com.example.demo01;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void catchSth(Mouse m) {
		System.out.println(this.getName()+"ȥ׽"+m.getName()+",����������");
	}
}
