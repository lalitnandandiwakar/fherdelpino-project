package com.curso.examen;
public class Test {
	public void method(Object o){
		System.out.println("Object method");
	}
	public void method(TestAbc t){
		System.out.println("TestAbc method");
	}
	public static void main(String args[]){
		Test test = new Test();
		test.method(null);
	}
}
class TestAbc extends Object {
	
}