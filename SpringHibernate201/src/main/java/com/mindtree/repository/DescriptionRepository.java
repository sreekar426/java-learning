package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.DescriptionTypeEntity;

public interface DescriptionRepository extends JpaRepository<DescriptionTypeEntity, String> {

	DescriptionTypeEntity findByDescTypeAndZoneZoneId(String descType,int zoneId);

}
