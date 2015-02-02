package com.example.datastore.jdo.entities;

import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Employee extends LongIdEntity {

    @Persistent
    private String firstName;

    @Persistent
    private String lastName;

    @Persistent
    private Date hireDate;

    public Employee() {

    }

    public Employee(String firstName, String lastName, Date hireDate) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.hireDate = hireDate;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Date getHireDate() {
	return hireDate;
    }

    public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
    }
}