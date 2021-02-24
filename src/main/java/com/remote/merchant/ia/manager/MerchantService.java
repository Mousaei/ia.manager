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
	          		+ "\n" + "Nous allons acheter 4 kilos d'oranges.\n" + ""
	          		+  "<p></p>\n"
	          		+ "\n" + "Nous allons acheter 4 kilos de fruits et légumes (pommes, oranges, ...)."
	          		+  "<p></p>\n" +"Notre point de départ est le point A. \n" 
	          		+  "Nous passerons par le Point B et C avant d'arriver au supermarché:\n"
	          		+  "Soit le point D.\n" + "" + "<br/>"
	          		+  "<p></p>\n"
	          		+ "\n" + "Nous pouvons livrer 3 kilos de fruits ou légumes sur notre trajet de retour. "
	          		+  "<p></p>\n"	+ "Vous devez vous inscrire sur notre site:\n" + "" + "<br/>"
	          		+ "\n" + " 1- Pour acheter ou vendre des Fruits et Légumes si vous êtes sur notre trajet de retour. "
	          		+  "<p></p>\n" + "2- Pour acheter ou vendre des Fruits et Légumes si vous êtes sur le trajet de retour d une des personnes inscrites sur notre plateforme.\n" + "" + "<br/>"
	          		+  "<p></p>\n"
	          	    + "<a href=" + "http://nutrition.object-decision.com>" + "This is my first link</a>" 
	          	    +  "<p></p>\n"

 
					
					
					+ "<h2>HTML Forms</h2>"
					+  "<form action='/merchant'>"
					+  "<fieldset>"
					+  "<legend>Choose your features</legend>"
					+  "<p></p>\n"
					+ "\n"
					+ "<div>\n"
					+ "  <input type=\"checkbox\" id=\"FruitsLegumes\" name=\"FruitsLegumes\"\n"
					+ "         checked>\n"
					+ "  <label for=\"FruitsLegumes\">Recherche des Fruits et Legumes</label>\n"
					+ "</div>\n"
					
					
					+ "\n"
					+ "<div>\n"
					+ "  <input type=\"checkbox\" id=\"Personnes\" name=\"Personnes\"\n"
					+ "         checked>\n"
					+ "  <label for=\"Personnes\">Recherche des Personnes</label>\n"
					+ "</div>\n"
					+ "<div>\n"
					+ "  <input type=\"checkbox\" id=\"Trajets\" name=\"Trajets\">\n"
					+ "  <label for=\"Trajets\">Recherche des Trajets</label>\n"
					+ "</div>\n"
					+ "\n"
					
					+ "<div>\n"
					+ "  <input type=\"checkbox\" id=\"InscriptionAbonnement\" name=\"Abonnement\"\n"
					+ "  <label for=\"InscriptionAbonnement\">Inscription et Abonnement</label>\n"
					+ "</div>\n"

					+  "<p></p>\n"
					+  "<p></p>\n"

					
					+  "<label for='fname'>First name:</label><br>"
					+  "<input type='text' id='fname' name='fname' value='John'><br> "
						
					+ " <label for='lname'>Last name:</label><br> "
					+ "	<input type='text' id='lname' name='lname'value='Way'><br><br> "
					
					+ " <label for='email'>email:</label><br> "
					+ "	<input type='text' id='email' name='email'value='email'><br><br> "

					+ " <label for='No Tel'>No Tel:</label><br> "
					+ "	<input type='text' id='NoTel' name='NoTel' value='No Tel'><br><br> "
					
					+ " <label for='Fruits et Legumes'>Fruits et Légumes</label><br> "
					+ "	<input type='text' id='FruitsLegumes' name='FruitsLegumes' value='Fruits et Legumes'><br><br> "
					
					+ " <label for='Jour et Heure'>Jour et heure de votre achat</label><br> "
					+ "	<input type='text' id='JouretHeure' name='JouretHeure' value='Jour et heure de votre achat'><br><br> "
					
					+ " <label for='Adresse Point A'>Adresse Point A:</label><br> "
					+ "	<input type='adresse_Point_A' id='adresse_Point_A' name='adresse Point A'value='No rue Nom Rue Code postal Ville'><br><br> "
					
					+ " <label for='Adresse Point B'>Adresse Point B:</label><br> "
					+ "	<input type='adresse_Point_B' id='adresse_Point_B' name='adresse Point B'value='No rue Nom Rue Code postal Ville'><br><br> "
					
					+ " <label for='Adresse Point C'>Adresse Point C:</label><br> "
					+ "	<input type='adresse_Point_C' id='adresse_Point_C' name='adresse Point C'value='No rue Nom Rue Code postal Ville'><br><br> "
					
					+ " <label for='Adresse Point D'>Adresse Point D:</label><br> "
					+ "	<input type='adresse_Point_D' id='adresse_Point_D' name='adresse Point D'value='No rue Nom Rue Code postal Ville'><br><br> "
					
					+ " <input type='submit' value='Submit'> "
					+ " </form> "
					
									
	          		
	          		+ "</body>\n" +
	       	   "</html>";
	   }
	    
	}