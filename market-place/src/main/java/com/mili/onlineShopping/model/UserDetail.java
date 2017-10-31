package com.mili.onlineShopping.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

public class UserDetail implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	@NotBlank(message="First Name cannot be blank")
	private String fName;
	@NotBlank(message="Last Name cannot be blank")
	private String lName;
	@NotBlank(message="Email cannot be blank")
	private String email;
	private String role;
	private boolean enable=true;
	@NotBlank(message="Password cannot be blank")
	private String password;
	@Transient
	private String confirmPassword;
	@NotBlank(message="Contact Number cannot be blank")
	private String contactNumber;
	private Cart cart;
	private Set<Product>products;
	private Set<Address>addresses;
	
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", role="
				+ role + ", enable=" + enable + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", contactNumber=" + contactNumber + ", cart=" + cart + ", products=" + products + ", addresses="
				+ addresses + "]";
	}


	
	
	
	
	
}