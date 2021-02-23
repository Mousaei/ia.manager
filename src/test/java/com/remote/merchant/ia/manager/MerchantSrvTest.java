/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


/**
 * @author vahidmousaei
 *
 */
@RunWith(SpringRunner.class)
public class MerchantSrvTest {

	/**
	 * 
	 */
	public MerchantSrvTest() {
		// TODO Auto-generated constructor stub
	}
	

	 @Mock
	 private RestTemplate restTemplate;
	 
	 @InjectMocks
	 private MerchantService merchantService;
	 
	 @Test
	 public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
		 	MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "1", LocalDate.of(2020, 12, 31));
	        //Mockito.when(restTemplate.getForEntity("http://localhost:8080/merchant/1", MerchantBean.class)).thenReturn(new ResponseEntity<MerchantBean>(merchant, HttpStatus.OK));
		 	merchant.getFirstName();
	        //Assert.notNull(merchant);
	 }
	
} 