package com.springmvc.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {
	
	@RequestMapping("web")
	public String Showpage(){
		return "main-menu";
				
		
	} 

}
