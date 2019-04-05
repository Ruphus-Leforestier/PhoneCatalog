package model;

import java.util.Objects;

public class PhoneNumber implements java.io.Serializable{
	
	private static final String areaCode ="+49 ";
	private String number;
	
	public PhoneNumber() {}
	public PhoneNumber(String nbr) {number = nbr;}
	
	public String getNumber() {
		return areaCode + number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o){return true;}
		if(o == null || getClass() != o.getClass()){return false;}	
		
		PhoneNumber p = (PhoneNumber) o;
		return Objects.equals(o, p.getNumber());
	}
	
	@Override
	public int hashCode() {return Objects.hash(getNumber());}
	@Override
	public String toString() {return getNumber();}
}
