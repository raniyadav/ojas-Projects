package com.app.abstrac;

abstract class Animal{
	abstract void soundofAnimal();
	void disp(){
		System.out.println("welcome");
	}
}
class Cat extends Animal{

	void soundofAnimal() {
		// TODO Auto-generated method stub
		System.out.println("Meoh Meoh");
	}

}
class Dog extends Animal{

	void soundofAnimal() {
		// TODO Auto-generated method stub
		System.out.println(" Bow Bow");
	}

}
public class DerivedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj= new Cat();
		obj.soundofAnimal();
		obj=new Dog();
		obj.soundofAnimal();
		obj.disp();

	}

}
