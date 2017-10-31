package com.mili.onlineShopping.dao.impl;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mili.onlineShopping.dao.UserDetailDao;
import com.mili.onlineShopping.model.Address;
import com.mili.onlineShopping.model.Cart;
import com.mili.onlineShopping.model.UserDetail;

@Repository("userDetailDao")
@Transactional
public class UserDetailDaoImpl implements UserDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	
	public boolean addUser(UserDetail userDetail) {
			try {	
			sessionFactory.getCurrentSession().persist(userDetail);			
				return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
}

	@Override
	public boolean addAddress(Address address) {
		try {	
			sessionFactory.getCurrentSession().persist(address);					
				return true;
			}catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDetail getUserByEmail(String email) {
		String selectActiveProduct="From UserDetail U WHERE U.email = '"+email+"'";
		try {
		return sessionFactory.getCurrentSession().createQuery(selectActiveProduct,UserDetail.class).getSingleResult();
		}catch (Exception e) {
			return null;
		}
	}

}
