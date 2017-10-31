package com.mili.onlineShopping.service;

import com.mili.onlineShopping.model.Address;
import com.mili.onlineShopping.model.Cart;
import com.mili.onlineShopping.model.UserDetail;

public interface UserDetailService {

	boolean addUser(UserDetail userDetail);
	boolean addAddress(Address address);
	boolean addCart(Cart cart);
	UserDetail getUserByEmail(String email);
}
