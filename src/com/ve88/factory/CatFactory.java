package com.ve88.factory;

public class CatFactory implements Factory {



	@Override
	public Animal cearteFactory() {
		// TODO Auto-generated method stub
		return new Cat();
	}

}
