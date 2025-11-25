package com.example.user.model;

public class User {

	    private Long id;
	    private String name;
	    private String mobile;

	    // Default constructor
	    public User() {
	    }

	    // Parameterized constructor
	    public User(Long id, String name, String mobile) {
	        this.id = id;
	        this.name = name;
	        this.mobile = mobile;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getMobile() {
	        return mobile;
	    }
	    public void setMobile(String mobile) {
	        this.mobile = mobile;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "User{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", mobile='" + mobile + '\'' +
	                '}';
	    }
}
