/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * @author vahidmousaei
 *
 */
@RunWith(Suite.class)
@SuiteClasses({})
public class MerchantSrvTest {

	/**
	 * 
	 */
	public MerchantSrvTest() {
		// TODO Auto-generated constructor stub
	}
	
	 @Test
	 public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
		 	MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "1", LocalDate.of(2020, 12, 31));
	        Assert.assertNotNull(merchant);
	 }
	
} 