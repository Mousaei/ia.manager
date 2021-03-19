package com.remote.merchant.ia.manager;

public class MerchantBeanNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MerchantBeanNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }

}
