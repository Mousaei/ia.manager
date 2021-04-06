package com.remote.merchant.ia.manager;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< Updated upstream


@SuppressWarnings("hiding")
=======
import antlr.collections.List;

>>>>>>> Stashed changes
@RestController
public class GreetingController<Long> {

	private final MerchantRepository repository;
	
	GreetingController(MerchantRepository repository) {
	    this.repository = repository;
	  }
	
	// Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/MerchantBeans")
	  List<MerchantBean> all() {
	    return repository.findAll();
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/MerchantBeans")
	  MerchantBean newMerchantBean(@RequestBody MerchantBean newMerchantBean) {
	    return repository.save(newMerchantBean);
	  }

	  // Single item
	  
	  @GetMapping("/MerchantBeans/{id}")
	  MerchantBean one(@PathVariable java.lang.Long id) {
	    
	    return repository.findById((java.lang.Long) id)
	      .orElseThrow(() -> new MerchantBeanNotFoundException(id));
	  }

	  @PutMapping("/MerchantBeans/{id}")
	  MerchantBean replaceMerchantBean(@RequestBody MerchantBean newMerchantBean, @PathVariable java.lang.Long id) {
	    
	    return repository.findById(id)
	      .map(MerchantBean -> {
	        MerchantBean.setFirstName(newMerchantBean.getFirstName());
	        MerchantBean.setLastName(newMerchantBean.getLastName());
	        return repository.save(MerchantBean);
	      })
	      .orElseGet(() -> {
	        newMerchantBean.setId(id);
	        return repository.save(newMerchantBean);
	      });
	  }

	  @DeleteMapping("/MerchantBeans/{id}")
	  void deleteMerchantBean(@PathVariable java.lang.Long id) {
	    repository.deleteById(id);
	  }
	
}
