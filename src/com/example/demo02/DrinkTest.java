package com.example.demo02;

public class DrinkTest {

	public static void main(String[] args) {
		Latte d1 = new Latte("今天卖的第一杯拿铁");
		Mocha d2 = new Mocha("今天卖的第一杯摩卡");
		RedTea d3 = new RedTea("今天卖的第一杯红茶");
		GreenTea d4 = new GreenTea("今天卖的第一杯绿茶");
		
		d1.make();
		d2.make();
		d3.make();
		d4.make();

	}

}
