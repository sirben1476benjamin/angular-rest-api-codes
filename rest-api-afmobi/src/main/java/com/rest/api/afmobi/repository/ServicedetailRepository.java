/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.repository;

import com.rest.api.afmobi.model.Servicedetail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author AFMOBI
 */
@RepositoryRestResource(collectionResourceRel = "servicedetails", path = "servicedetails")
public interface ServicedetailRepository extends CrudRepository<Servicedetail, Long> {
   @Query("from Servicedetail s where lower(s.servicedetailid) like CONCAT('%', lower(:servicedetailid), '%')")
   public Iterable<Servicedetail> findByServicedetailid(@Param("servicedetailid") Long servicedetailid); 
}