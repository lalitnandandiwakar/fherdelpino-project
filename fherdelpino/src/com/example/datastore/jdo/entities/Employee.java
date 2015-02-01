package com.example.datastore.jdo.entities;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Employee {

    /**
     * Use this for objects without entity group parents whose IDs should be
     * generated automatically by the datastore.
     */
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

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

    // Accessors for the fields. JDO doesn't use these, but your application
    // does.

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