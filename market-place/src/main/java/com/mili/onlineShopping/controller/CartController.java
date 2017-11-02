package com.mili.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class CartController {

	@RequestMapping(value="/show")
	public ModelAndView showCart() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","My Cart");
	mv.addObject("onClickShowCart",true );
	mv.addObject("cartLine",null);
	return mv;
	}
}
