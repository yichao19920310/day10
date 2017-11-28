package com.example.demo01;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	public void catchSth(Mouse m) {
		
			System.out.println(this.getName()+"抓住了"+m.getName()+",把它吃了");
		
	}
}
