/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.repository;

import com.rest.api.afmobi.model.Payloadservice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author AFMOBI
 */
@RepositoryRestResource(collectionResourceRel = "payloadservices", path = "payloadservices")
public interface PayloadServiceRepository extends CrudRepository<Payloadservice, Long> {
    @Query("from Payloadservice p where lower(p.msisdn) like CONCAT('%', lower(:msisdn), '%')")
    public Iterable<Payloadservice> findByMsisdn(@Param("msisdn") String msisdn);
    
}
