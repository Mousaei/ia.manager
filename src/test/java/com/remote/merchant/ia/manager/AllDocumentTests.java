package com.remote.merchant.ia.manager;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({})
public class AllDocumentTests {
	 
	 @Test
	 public void getAllMockedDocumentMockedObject() {
		    MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	        merchant.getFirstName();
	        Assert.assertNotNull(merchant);
	 }
	 
}
