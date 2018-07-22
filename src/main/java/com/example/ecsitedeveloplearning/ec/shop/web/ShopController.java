package com.example.ecsitedeveloplearning.ec.shop.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.service.ShopService;

@Controller
@RequestMapping(path="/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	// 商品情報全件表示
	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView viewProduct(Model model) {
		List<Product> products = shopService.findAll();
		ModelAndView mv = new ModelAndView("shop/top");
		mv.addObject("products", products);
		
		//model.addAttribute("products", products);
		
		System.out.println("products : " + products.toString());
		return mv;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String tester() {
		return "shop/test";
	}
	
}
