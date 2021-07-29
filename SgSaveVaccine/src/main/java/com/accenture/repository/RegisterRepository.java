package com.accenture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.accenture.model.Register;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "registers", itemResourceRel = "register")
@Repository
public interface RegisterRepository extends  JpaRepository<Register, Integer>  {
	List<Register> findAllByClinicid(int clinicid);
	List<Register> findAllByclinicname(String clinicname);

}
