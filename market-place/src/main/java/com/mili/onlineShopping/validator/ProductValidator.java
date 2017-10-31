package com.mili.onlineShopping.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mili.onlineShopping.model.Product;

public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		
		return Product.class.equals(cls);
	}

	@Override
	public void validate(Object result, Errors errors) {
		Product product=(Product) result;
		if(product.getImage_file()==null || product.getImage_file().getOriginalFilename().equals("")) {
			errors.rejectValue("image_file", null, "Please Choose a File to Upload");
			return;
		}
		if(!(product.getImage_file().getContentType().equals("images/jpeg")||
				product.getImage_file().getContentType().equals("images/png")||
				product.getImage_file().getContentType().equals("images/gif"))) {
			errors.rejectValue("image_file", null, "Please Choose Only image File to Upload");
			return;
			
		}

	}

}
