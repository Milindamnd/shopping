package com.mili.onlineShopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mili.onlineShopping.model.Category;
import com.mili.onlineShopping.model.Product;
import com.mili.onlineShopping.service.CategoryService;
import com.mili.onlineShopping.service.ProductService;
import com.mili.onlineShopping.util.FileUploadUtil;
import com.mili.onlineShopping.validator.ProductValidator;


@Controller
@RequestMapping("/manage")
public class ManageController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public ModelAndView manageProduct(@RequestParam(name="operation",required=false)String operation) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("onClickManageProduct",true);
		mv.addObject("title","Manage Products");
		Product nProduct=new Product();
		nProduct.setSupplier_id(1);
		nProduct.setActive(true);
		mv.addObject("product",nProduct);
		
		if(operation!=null) {
			if(operation.equals("product")) {
				mv.addObject("message","Product Added Successfully...!!!");
			}else if(operation.equals("category")) {
				mv.addObject("message","Category Added Successfully...!!!");
			}
			
		}
		return mv;
		
	}
	@RequestMapping(value="/{id}/products",method=RequestMethod.GET)
	public ModelAndView updateManageProduct(@PathVariable int id) {
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("onClickManageProduct",true);
		mv.addObject("title","Manage Products");
		Product nProduct=productService.getSingleProductById(id);
		mv.addObject("product",nProduct);
		return mv;
		
	}
	//hadling product submit
	@RequestMapping(value="/products",method=RequestMethod.POST)
	public String hadleProductSubmit(@Valid @ModelAttribute("product")Product product,BindingResult result,Model model,
			HttpServletRequest request) {
		/*if(product.getProductId()==0) {
			new ProductValidator().validate(product, result);
		}else {
			if(!(product.getImage_file().getOriginalFilename().equals(""))) {
				new ProductValidator().validate(product, result);
			}
		}*/
		
		
		if(result.hasErrors()) {
			model.addAttribute("onClickManageProduct",true);
			model.addAttribute("title","Manage Products");
			model.addAttribute("messageError","Sorry..Product Added Failed..!!!");
			return "page";
		}
		if(!product.getImage_file().getOriginalFilename().equals("")) {
			FileUploadUtil.uploadImageFile(request,product.getImage_file(),product.getCode());
		}
		if(product.getProductId()== 0) {
			productService.addProduct(product);	
		}else {
			productService.updateProduct(product);
		}
		
		
		return "redirect:/manage/products?operation=product";
	}
	@ModelAttribute("categories")
	public List<Category>getListOfCategory(){
		return categoryService.list() ;
		
	}
	@RequestMapping(value="/product/{id}/activation")
	@ResponseBody
	public String updateActiveProduct(@PathVariable int id) {
		Product product=productService.getSingleProductById(id);
		boolean isActive=product.isActive();
		product.setActive(!product.isActive());
		productService.updateProduct(product);
		return (isActive)?"You Are Successfully Deactivate This Product":"You Are Successfully activate This Product";
	}
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public String addCategory(@ModelAttribute Category category) {
		categoryService.addCategory(category);
		return "redirect:/manage/products?operation=category";
		
	}
	@ModelAttribute(value="category")
	public Category getCategory() {
		return new Category();
	}
	

	
}
