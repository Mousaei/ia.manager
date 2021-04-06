package com.remote.merchant.ia.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MerchantModelAssembler implements RepresentationModelAssembler<MerchantBean, EntityModel<MerchantBean>> {
	
	@Autowired
	MerchantRepository mtRepository;
	
	@SuppressWarnings("unused")
	private Object all() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unused")
	private MerchantModelAssembler methodOn(@SuppressWarnings("rawtypes") final Class<GreetingController> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityModel<MerchantBean> toModel(MerchantBean employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
