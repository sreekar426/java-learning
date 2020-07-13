package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.ZoneEntity;

public interface ZoneRepository extends JpaRepository<ZoneEntity, String> {
	

	ZoneEntity findByZoneType(String zoneName);
	
	
}
