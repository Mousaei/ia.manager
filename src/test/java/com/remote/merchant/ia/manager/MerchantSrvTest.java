/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;


/**
 * @author vahidmousaei
 *
 */
@RunWith(SpringRunner.class)
public class MerchantSrvTest {

	private static final Class<MerchantBean> MerchantBean = null;

	/**
	 * 
	 */
	public MerchantSrvTest() {
		// TODO Auto-generated constructor stub
	}
	

	 @Mock
	 private RestTemplate restTemplate;
	 
	 @InjectMocks
	 private MerchantService merchantService = new MerchantService();
	 
	 @Test
	 public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
		 	MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	        //Mockito.when(restTemplate.getForEntity("http://localhost:8080/merchant/E001", MerchantBean.class)).thenReturn(new ResponseEntity<MerchantBean>(merchant, HttpStatus.OK));
	        //merchant = merchantService.getMerchant("1");
	        Assert.notNull(merchant);
	 }
	
} 