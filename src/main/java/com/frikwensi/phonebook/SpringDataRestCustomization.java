package com.frikwensi.phonebook;

import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@Component
public class SpringDataRestCustomization  extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	config.getCorsRegistry().addMapping("/api/**");
    }
    
}
