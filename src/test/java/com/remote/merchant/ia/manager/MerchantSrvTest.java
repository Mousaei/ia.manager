/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * @author vahidmousaei
 *
 */
public class MerchantSrvTest {

	/**
	 * 
	 */
	public MerchantSrvTest() {
		// TODO Auto-generated constructor stub
	}
	
	 public void givenMockingIsDonet() {
		 	MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "1", LocalDate.of(2020, 12, 31));
	        Assert.assertNotNull(merchant);
	 }
	 
	 public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
		 	MerchantBean merchant = new MerchantBean("Lyes", "Mouloudi", "1", LocalDate.of(2020, 12, 31));
	        Assert.assertNotNull(merchant);
	 }
	
} 