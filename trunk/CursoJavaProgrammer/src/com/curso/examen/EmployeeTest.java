package com.curso.examen;

class Person {
	String name = "no name";

	public Person(String nm) {
		name = nm;
	}
}

class Employee extends Person {
	String empID = "0000";

	public Employee(String id) {
		super(new String()); //error de compilacion si quitas esta linea
		empID = id;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("4321");
		System.out.println(e.empID);

	}

}
