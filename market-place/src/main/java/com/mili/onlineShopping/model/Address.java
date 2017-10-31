package com.mili.onlineShopping.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int addressId;
	private int userId;
	@NotBlank(message="Address cannot be blank")
	private String addressLineOne;
	@NotBlank(message="Address cannot be blank")
	private String addressLineTwo;
	@NotBlank(message="City cannot be blank")
	private String city;
	@NotBlank(message="State cannot be blank")
	private String state;
	@NotBlank(message="Country cannot be blank")
	private String country;
	@NotBlank(message="Postal Code cannot be blank")
	private String postalCode;
	
	private boolean billing;
	private boolean shipping;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	

	public int getAddressId() {
		return addressId;
	}



	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public boolean isBilling() {
		return billing;
	}

	public void setBilling(boolean billing) {
		this.billing = billing;
	}

	public boolean isShipping() {
		return shipping;
	}

	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}



	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", userId=" + userId + ", addressLineOne=" + addressLineOne
				+ ", addressLineTwo=" + addressLineTwo + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", billing=" + billing + ", shipping=" + shipping + "]";
	}






	
	
	
}
