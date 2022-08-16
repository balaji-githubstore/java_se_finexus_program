package com.finexus.methodoverriding;


class Animal
{
	
	public void talk()
	{
		System.out.println("What to talk?");
	}
}

class Dog extends Animal
{

	public void talk()
	{
		System.out.println("Bark!!");
	}
}

class Cat extends Animal
{
	
}



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.talk();
		
		Cat c=new Cat();
		c.talk();

	}

}
