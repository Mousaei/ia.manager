package com.remote.merchant.ia.manager;
import org.springframework.beans.factory.annotation.Autowired;


public class MerchantServiceImpl implements MerchantService{
	
	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public MerchantBean addNewUser(MerchantBean mBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MerchantBean findByLastName(MerchantBean mBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public MerchantRepository getMerchantRepository() {
		return merchantRepository;
	}

	public void setMerchantRepository(MerchantRepository merchantRepository) {
		this.merchantRepository = merchantRepository;
	}
	
}
