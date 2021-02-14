package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class MerchantService {
	    
	   @RequestMapping("/merchant")
	   public MerchantBean getMerchant(String id) {
		   MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "1", LocalDate.of(2020, 12, 31));
	       return merchant;
	   
	   }
	   
	   @GetMapping(value = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
	   @ResponseBody
	   public String welcomeAsHTML() {
	        return "<html>\n" + "<header><title>Welcome</title></header>\n" +
	          "<body>\n" + "Hello world\n" + "</body>\n" +
	          "<a href=" + "http://nutrition.object-decision.com>" + "This is my first link</a>" +		
	          "</html>";
	   }
	    
	}