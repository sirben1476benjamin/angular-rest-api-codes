/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.repository;

import com.rest.api.afmobi.model.Epayload;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author AFMOBI
 */
@RepositoryRestResource(collectionResourceRel = "epayloads", path = "epayloads")
public interface EpayloadRepository extends CrudRepository<Epayload, Long> {
   @Query("from Epayload e where lower(e.msisdn) like CONCAT('%', lower(:msisdn), '%')")
    public Iterable<Epayload> findByMsisdn(@Param("msisdn") String msisdn); 
}
