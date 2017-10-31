package com.mili.onlineShopping.model;

import java.io.Serializable;

public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int userId;
	private UserDetail userDetail;
	private int cartLine;
	private double grandTotal;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}





	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCartLine() {
		return cartLine;
	}

	public void setCartLine(int cartLine) {
		this.cartLine = cartLine;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}



	public UserDetail getUserDetail() {
		return userDetail;
	}





	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}





	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", userDetail=" + userDetail + ", cartLine=" + cartLine + ", grandTotal="
				+ grandTotal + "]";
	}






}
