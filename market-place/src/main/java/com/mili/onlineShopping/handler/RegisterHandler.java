package com.mili.onlineShopping.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.mili.onlineShopping.model.Address;
import com.mili.onlineShopping.model.Cart;
import com.mili.onlineShopping.model.RegisterModel;
import com.mili.onlineShopping.model.UserDetail;
import com.mili.onlineShopping.service.UserDetailService;

@Component
public class RegisterHandler {

	@Autowired
	UserDetailService userDetailService;
	/*@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	*/
	
	public RegisterModel init() {
		return new RegisterModel();
	}
	public void handleUser(RegisterModel registerModel,UserDetail userDetail) {
		registerModel.setUserDetail(userDetail);
	}
	public void handleAddress(RegisterModel registerModel,Address address) {
		registerModel.setAddress(address);
	}
	public String saveAll(RegisterModel model) { 
		String trasActionComplete="success";
		UserDetail detail=model.getUserDetail();
		
		if(detail.getRole().equals("USER")) {
			Cart cart=new Cart();
			cart.setUserDetail(detail);
			
			detail.setCart(cart);
			
		}
		//create password encoder
	/*	detail.setPassword(passwordEncoder.encode(detail.getPassword()));*/
		userDetailService.addUser(detail);
		
	
		Address address=model.getAddress();
		address.setUserId(detail.getUserId());
		address.setBilling(true);
		userDetailService.addAddress(address);
		
		return trasActionComplete;
		
		
}
	public String validateUser(UserDetail userDetail,MessageContext messageContext) {
		String resultString="success";
		if(!(userDetail.getPassword().equals(userDetail.getConfirmPassword()))) {
			MessageBuilder builder=new MessageBuilder();
			messageContext.addMessage(builder.error().source("confirmPassword").defaultText("Password doesn't match").build());
			return "fail";
		}
		if(userDetailService.getUserByEmail(userDetail.getEmail())!=null) {
			MessageBuilder builder=new MessageBuilder();
			messageContext.addMessage(builder.error().source("email").defaultText("Email alredy exist").build());
			return "fail";
			
		}
		return resultString;
	}
	
	
	
}