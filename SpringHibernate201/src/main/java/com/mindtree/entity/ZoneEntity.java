package com.mindtree.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class ZoneEntity.
 */
@Entity
@Data
@EqualsAndHashCode
@Table(name="zone")
public class ZoneEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/** The zone id. */
	@Id
	@Column(name = "zone_id")
	private int zoneId;

	/** The zone type. */
	@Column(name = "zone_type")
	private String zoneType;
	
	@Column(name = "owner_amount")
	private double ownerAmount;
	
	@Column(name = "tenant_amount")
	private double tenantAmount;
	
	@OneToMany(mappedBy="zone")
	private List<DescriptionTypeEntity> descriptionTypeEntities;


}
