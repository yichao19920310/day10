package com.example.demo02;

public class Mocha extends Coffee {

	public Mocha() {
		
	}

	public Mocha(String name) {
		super(name);
		
	}

	@Override
	public void make() {
		System.out.println("摩卡制作:烧水,煮咖啡壶,冲泡,加巧克力.");

	}

}
