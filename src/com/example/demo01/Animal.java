package com.example.demo01;

public class Animal {

	private String name;
	private boolean isAlive;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Animal() {
		this.isAlive = true;
	}
	
	public Animal(String name) {
		this();
		this.name = name;
		
	}
	public void catchSth() {
		System.out.println("����ץ��Ϊ");
	}
	
	public void eatSth() {
		System.out.println("�������Ϊ");
	}
	public void fightWith(Animal a) {
		System.out.println(this.getName()+"��"+a.getName()+"���");
		int x = (int)(Math.random()*2+1);
		if(x==1) {
			System.out.println(this.getName()+"Ӯ��");
			
		}else {
			System.out.println(a.getName()+"Ӯ��");
		}
	}
}
