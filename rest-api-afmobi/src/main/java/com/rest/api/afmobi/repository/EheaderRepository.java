/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.api.afmobi.repository;

import com.rest.api.afmobi.model.Eheader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author AFMOBI
 */
@RepositoryRestResource(collectionResourceRel = "eheaders", path = "eheaders")
public interface EheaderRepository extends CrudRepository<Eheader, String> {
   @Query("from Eheader e where lower(e.username) like CONCAT('%', lower(:username), '%')")
    public Iterable<Eheader> findByUsername(@Param("username") String username); 
}
