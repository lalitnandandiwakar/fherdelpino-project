package com.example.entities;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;

@PersistenceCapable
public class Greeting {

    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private User user;
    @Persistent
    private Date date;
    @Persistent
    private String content;

    public Greeting(User user, Date date, String content) {
	this.user = user;
	this.date = date;
	this.content = content;
    }

    public Key getKey() {
	return key;
    }

    public void setKey(Key key) {
	this.key = key;
    }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

}
