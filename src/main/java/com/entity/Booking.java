package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	private String name;
	private String email;
	private String bookingFor;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(String name, String email, String bookingFor, String address, String city, String state,
			String zip) {
		super();
		this.name = name;
		this.email = email;
		this.bookingFor = bookingFor;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBookingFor() {
		return bookingFor;
	}

	public void setBookingFor(String bookingFor) {
		this.bookingFor = bookingFor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", email=" + email + ", bookingFor=" + bookingFor + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
	

}
