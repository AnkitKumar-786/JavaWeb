package com.test;

class Animals {
	
	void eat() {
		System.out.println("eating....");
	}
}

class Dogs extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
      BabyDog d =  new BabyDog();
      d.bark();
      d.weep();
      d.eat();
       
	}

}
