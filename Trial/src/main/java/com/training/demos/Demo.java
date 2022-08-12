package com.training.demos;

import java.util.List;

public class Demo {
	public static void main(String[] args) {
		Delivery delivery=new Delivery();
		String message=delivery.greetMessage("James");
		System.out.println(message);
		List<String> dishs=delivery.showFood("Indian");
		System.out.println(dishs);

	}

}
