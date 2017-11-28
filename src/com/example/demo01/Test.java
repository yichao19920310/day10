package com.example.demo01;

public class Test {

	public static void main(String[] args) {
		
		Cat c = new Cat("ß÷ß÷");
		Dog d = new Dog("ÍôÍô");
		Mouse m = new Mouse("Ö¨Ö¨");
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
