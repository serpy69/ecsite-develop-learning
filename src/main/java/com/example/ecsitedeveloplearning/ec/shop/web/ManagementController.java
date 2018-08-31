package com.example.ecsitedeveloplearning.ec.shop.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.service.ManagementService;

@Controller
@RequestMapping(path="/shop")
public class ManagementController {
	
	@Autowired
	private ManagementService managementService;
	
	//商品情報全件表示
	@RequestMapping(value = "/ManagementTop", method = RequestMethod.GET)
	public ModelAndView viewProduct(Model model) {
		List<Product> products = managementService.findAll();
		ModelAndView mv = new ModelAndView("shop/ManagementTop");
		mv.addObject("Products", products);
		
		System.out.println("products : " + products.toString());
		return mv;
	}

}
