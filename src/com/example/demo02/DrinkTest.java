package com.example.demo02;

public class DrinkTest {

	public static void main(String[] args) {
		Latte d1 = new Latte("�������ĵ�һ������");
		Mocha d2 = new Mocha("�������ĵ�һ��Ħ��");
		RedTea d3 = new RedTea("�������ĵ�һ�����");
		GreenTea d4 = new GreenTea("�������ĵ�һ���̲�");
		
		d1.make();
		d2.make();
		d3.make();
		d4.make();

	}

}
