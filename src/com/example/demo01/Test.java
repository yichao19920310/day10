package com.example.demo01;

public class Test {

	public static void main(String[] args) {
		
		Cat c = new Cat("����");
		Dog d = new Dog("����");
		Mouse m = new Mouse("֨֨");
		c.catchSth();
		c.catchSth(m);
		d.catchSth();
		d.catchSth(m);
		m.catchSth();
		c.fightWith(d);
		c.fightWith(m);
		d.fightWith(c);
		d.fightWith(m);
		m.fightWith(c);
		m.fightWith(d);
	}

}
