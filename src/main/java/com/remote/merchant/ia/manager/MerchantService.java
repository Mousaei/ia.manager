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
	        return 
	           "<html>\n" 
	        		
	        		+ "<header><title>Welcome</title></header>\n" 
	        		+ "<body>\n" + "Hello world,\n" + " "
	          		+ "\n" + "Nous allons acheter 4 kilo d'organe.\n" + ""
	          		+ "\n" + "Notre point de départ est le point A. Nous passerons par le Point B et C avant d'arriver au supermarché: Soit le point D.\n" + "" + "<br/>"
	          		+ "\n" + "Nous pouvons livrer 3 kilos d'orange sur notre trajet de retour.\n" + "" + "<br/>"
	          		+ "\n" + "Vous devez vous inscrire sur notre site pour être livré en Fruits et Légumes si vous êtes sur notre trajet de retour.\n" + "" + "<br/>"
	          	    + "<a href=" + "http://nutrition.object-decision.com>" + "This is my first link</a>" 

					+ "<h2>HTML Forms</h2>"
					+  "<form action='action_page.php'>"
					+  "<label for='fname'>First name:</label><br>"
					+  "<input type='text' id='fname' name='fname' value='John'><br> "
					
					+ " <label for='lname'>Last name:</label><br> "
					+ "	<input type='text' id='lname' name='lname'value='Way'><br><br> "
					+ " <input type='submit' value='Submit'> "
					+ " </form> "
					
					
	          		
	          		+ "</body>\n" +
	       	   "</html>";
	   }
	    
	}