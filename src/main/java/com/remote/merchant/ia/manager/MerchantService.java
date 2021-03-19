package com.remote.merchant.ia.manager;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public interface MerchantService {
	
	@Transactional
	public MerchantBean addNewUser (MerchantBean mBean);
	
	public MerchantBean findByLastName(MerchantBean mBean);
	
}