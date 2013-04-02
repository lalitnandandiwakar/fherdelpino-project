package com.curso.examen;

import java.util.ArrayList;

class Pizza {
	ArrayList toppings;

	public final void addTopping(String topping) {
			toppings.add(topping);
	}
}

class PepperoniPizza extends Pizza {
//FIXME:compilation fails, no puedes sobreescribir un metodo final
//	public void addTopping(String topping) { 
//		System.out.println("Cannot add Toppings");
//	}
	
	public static void main (String[] args) {
		Pizza pizza = new PepperoniPizza();
		pizza.addTopping("Mushrooms");
	}
}
