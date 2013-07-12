package com.curso.examen;

class Plant {
	private String name;
	public Plant(String name){
		this.name = name;
	}
	
	public Plant() {
		//Plant("fern"); //error, la linea de abajo es la correcta
		this("fern");
	}
	public String getName() {
		return name;
	}
}

class Tree extends Plant {
	public void growFruit(){
		
	}
	public void dropLeaves(){}
	
}
