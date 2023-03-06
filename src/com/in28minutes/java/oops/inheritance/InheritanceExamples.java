package com.in28minutes.java.oops.inheritance;

abstract class Animal {
	String name;

	// not such a cool functionality
	abstract String bark();
}

class Dog extends Animal {
	String bark() {
		return "Bow Bow";
	}
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

public class InheritanceExamples {
	public static void main(String[] args) {
		Animal animal = new Cat();
		System.out.println(animal.bark());
	}
}
