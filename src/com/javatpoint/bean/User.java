package com.javatpoint.bean;

import javax.persistence.*;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Yvan Manzi
 *
 */

@Entity
@Table(name="users")
public class User {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
 
    @Column(name="name")
    private String name;
 
    @Column(name="email")
    private String email;
 
    @Column(name="password")
    private String password;
    
    @Column(name="sex")
    private String sex;
    
    @Column(name="country")
    private String country;
    
    public User() {
    }
    
    public User(int id, String name, String email, String password, String sex, String country) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }
    
    
    
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
