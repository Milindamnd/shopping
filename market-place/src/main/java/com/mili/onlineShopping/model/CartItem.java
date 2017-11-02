package com.mili.onlineShopping.model;

import java.io.Serializable;

public class CartItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int cartId;
	private double total;	
	private double buyingPrice;
	private boolean is_Available;
	private int productCount;
	private Product product;

	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public boolean isIs_Available() {
		return is_Available;
	}
	public void setIs_Available(boolean is_Available) {
		this.is_Available = is_Available;
	}
	
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", cartId=" + cartId + ", total=" + total + ", buyingPrice=" + buyingPrice
				+ ", is_Available=" + is_Available + ", productCount=" + productCount + ", product=" + product + "]";
	}
	
	

	
	
	
	
	
	

}
