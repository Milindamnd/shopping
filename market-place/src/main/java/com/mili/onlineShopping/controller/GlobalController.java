package com.mili.onlineShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mili.onlineShopping.model.UserCartModel;
import com.mili.onlineShopping.model.UserDetail;
import com.mili.onlineShopping.service.UserDetailService;

@ControllerAdvice
public class GlobalController {
	@Autowired
	private HttpSession httpSession;
	@Autowired
	private UserDetailService userDetailService;
	
	private UserCartModel userCartModel=null;
	
	@ModelAttribute("userCartModel")
	public UserCartModel getUserCartModel() {
		if(httpSession.getAttribute("userCartModel")==null) {
			Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			UserDetail userDetail=userDetailService.getUserByEmail(authentication.getName());
			if(userDetail != null) {
				userCartModel=new UserCartModel();
				userCartModel.setName(userDetail.getfName() + " " +userDetail.getlName());
				userCartModel.setEmail(userDetail.getEmail());
				userCartModel.setRole(userDetail.getRole());
				if(userCartModel.getRole().equals("USER")) {
					userCartModel.setCart(userDetail.getCart());
				}
				httpSession.setAttribute("userCartModel", userCartModel);
			}
			return userCartModel;
		}else {
			return (UserCartModel) httpSession.getAttribute("userCartModel");
		}
		
	}

}
