package com.rest.api.afmobi.repository;

import com.rest.api.afmobi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource(exported = true, collectionResourceRel = "users", path = "users")
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
@Query("from User u where lower(u.firstname) like CONCAT('%', lower(:firstname), '%')")
public Iterable<User> findByFirstname(@Param("firstname") String firstname);

 User findByUsername(String username);
}

