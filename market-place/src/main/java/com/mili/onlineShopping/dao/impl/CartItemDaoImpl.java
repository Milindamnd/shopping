package com.mili.onlineShopping.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mili.onlineShopping.dao.CartItemDao;
import com.mili.onlineShopping.model.CartItem;

@Repository("cartItemService")
@Transactional
public class CartItemDaoImpl implements CartItemDao {

	@Override
	public CartItem getCartItemById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CartItem> getListOfItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
