package model;

import java.util.Objects;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements java.io.Serializable{
	
	private int id;
	private String name;
	private PhoneNumber phoneNumber;
	
	public User() {}
	public User(String name) {this.name = name;}
	public User(String name, PhoneNumber number) {this.name = name; phoneNumber = number;}
	
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
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public boolean equals(Object u) {
		if(this == u) {return true;}
		if(this == null || getClass() != u.getClass()) {return false;}
		
		User user = (User) u;
		return Objects.equals(name, user.getName());
	}
	
	@Override
	public int hashCode() {return Objects.hash(getName());}
	
	@Override
	public String toString() {return getId()+"\t"+getName()+"\t"+getPhoneNumber();}
}
