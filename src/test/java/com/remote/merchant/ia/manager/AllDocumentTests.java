package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllDocumentTests {
	 private static final Class<?> MerchantBean = null;
	@Mock
	 private RestTemplate restTemplate;
	 @InjectMocks
	 private MerchantService merchantService = new MerchantService();
	
	 @Test
	 public void getAllMockedDocumentMockedObject() {
	        MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	        //Mockito.when(restTemplate.getForEntity("http://localhost:8080/merchant/E001", MerchantBean.class)).thenReturn(new ResponseEntity<MerchantBean>(merchant, HttpStatus.OK));
	        //merchant = merchantService.getMerchant("1");
	        Assert.notNull(merchant);
	 }
	 
	 //ReChercher des documents
	 //Verifier des documents
	 //Stocker des documents
	 //ReChercher des informations dans un document
	 //Verifier des informations d'un document
	 //Comment amléiorer les performances des personnes et des process

}
