package com.remote.merchant.ia.manager;

class MerchantNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MerchantNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
	}
