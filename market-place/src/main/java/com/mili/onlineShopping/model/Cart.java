package com.mili.onlineShopping.model;

import java.io.Serializable;
import java.util.Set;

public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cartId;
	private int userId;
	private UserDetail userDetail;
	private int cartLine;
	private double grandTotal;
	private Set<CartItem>cartItems;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}





	public int getCartId() {
		return cartId;
	}





	public void setCartId(int cartId) {
		this.cartId = cartId;
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





	public Set<CartItem> getCartItems() {
		return cartItems;
	}





	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}





	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", userDetail=" + userDetail + ", cartLine=" + cartLine
				+ ", grandTotal=" + grandTotal + ", cartItems=" + cartItems + "]";
	}










	





}
