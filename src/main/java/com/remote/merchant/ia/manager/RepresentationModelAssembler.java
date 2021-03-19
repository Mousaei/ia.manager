package com.remote.merchant.ia.manager;

public interface RepresentationModelAssembler<T1, T2> {

	EntityModel<MerchantBean> toModel(MerchantBean employee);

}
