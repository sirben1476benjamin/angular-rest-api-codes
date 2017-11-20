/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.repository;

/**
 *
 * @author AFMOBI
 */
import com.rest.api.afmobi.model.Epayload;
import com.rest.api.afmobi.model.Hero;
import com.rest.api.afmobi.model.Payloadservice;
import com.rest.api.afmobi.model.Servicedetail;
import com.rest.api.afmobi.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Hero.class,User.class,Epayload.class,Servicedetail.class,Payloadservice.class);
    }
}
