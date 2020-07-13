package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.PropertyEntity;

public interface PropertyRepository extends JpaRepository<PropertyEntity, String> {

	PropertyEntity findByDescriptionTypeEntityDescIdAndStatus(int descId,String statusId);
	
}
