package com.example.demo01;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	public void catchSth(Mouse m) {
		
			System.out.println(this.getName()+"ץס��"+m.getName()+",��������");
		
	}
}
