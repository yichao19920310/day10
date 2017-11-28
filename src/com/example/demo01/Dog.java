package com.example.demo01;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void catchSth(Mouse m) {
		System.out.println(this.getName()+"去捉"+m.getName()+",把它吓跑了");
	}
}
