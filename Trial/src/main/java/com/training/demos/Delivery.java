package com.training.demos;

import java.util.Arrays;
import java.util.List;

public class Delivery {
	public List<String> showFood(String type){
		if(type.equals("Chinese"))
			return Arrays.asList("Noodles","FriedRice","Momos");
		if(type.equals("Indian"))
			return Arrays.asList("Idly","MasalaDosa","Vada");
		if(type.equals("Snacks"))
			return Arrays.asList("Samosa","EggPuff","FrenchFries");
		return null;
	}
	
	public String greetMessage(String name) {
		return "Have a great day "+name;
	}

}
