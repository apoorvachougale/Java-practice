package com.java.demo.inheritance;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainEagle mEagle = new MountainEagle();
		mEagle.name ="Mountain Eagle";
		mEagle.eat();
		mEagle.fly();
		
		SerpantEagle seagle = new SerpantEagle();
		seagle.name = "Serpant Eagle";
		seagle.eat();
		seagle.fly();
		
		VegSparrow veg = new VegSparrow();
		veg.name = "Veg Sparrow";
		veg.eat();
		veg.fly();
		
		NonVegSparrow nonveg = new NonVegSparrow();
		nonveg.name="Non-veg Sparrow";
		nonveg.eat();
		nonveg.fly();

	}

}
