package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController 
{
	@RequestMapping("/")
	public String welcome() 
	{
		System.out.println("------controller-------");	 
	    return "index";
	}

}
