package com.mili.onlineShopping.dao;

import java.util.List;

import com.mili.onlineShopping.model.CartItem;

public interface CartItemDao {
	public CartItem getCartItemById(int id);
	public boolean addCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public List<CartItem>getListOfItems();

}
