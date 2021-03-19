package com.remote.merchant.ia.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(MerchantRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new MerchantBean("Bilbo Baggins", "burglar", null)));
      log.info("Preloading " + repository.save(new MerchantBean("Frodo Baggins", "thief", null)));
    };
  }
}
