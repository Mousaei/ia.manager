package com.remote.merchant.ia.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MerchantService {
	    
	    @Autowired
	    private RestTemplate restTemplate;
	 
	    public MerchantBean getMerchant(String id) {
		ResponseEntity<MerchantBean> resp = 
	          restTemplate.getForEntity("http://localhost:8080/merchant/" + id, MerchantBean.class);
	        
		if (resp.getStatusCode() == HttpStatus.OK)
			return resp.getBody();
		else
			return null;
	    }
	}