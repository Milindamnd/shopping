package com.mili.onlineShopping.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mili.onlineShopping.dao.UserDetailDao;
import com.mili.onlineShopping.model.Address;
import com.mili.onlineShopping.model.Cart;
import com.mili.onlineShopping.model.UserDetail;
import com.mili.onlineShopping.service.UserDetailService;

@Service("userDetailService")
@Transactional
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	UserDetailDao userDetailDao;
	@Override
	public boolean addUser(UserDetail userDetail) {
		return userDetailDao.addUser(userDetail);
	}

	@Override
	public boolean addAddress(Address address) {
		return userDetailDao.addAddress(address);
	}

	@Override
	public boolean addCart(Cart cart) {
		
		return userDetailDao.addCart(cart);
	}

	@Override
	public UserDetail getUserByEmail(String email) {
		return userDetailDao.getUserByEmail(email);
	}

}
