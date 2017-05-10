package com.ve88.factory;

public class DogFactory implements Factory {

	public DogFactory() {
	}

	@Override
	public Animal cearteFactory() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
