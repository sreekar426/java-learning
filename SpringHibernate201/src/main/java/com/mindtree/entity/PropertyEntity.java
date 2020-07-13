package com.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The Class PropertyEntity.
 */

@Entity
@Data
@EqualsAndHashCode
@Table(name = "property")
public class PropertyEntity {

	@Id
	@Column(name = "property_id")
	private int propertyId;

	@Column(name = "status")
	private String status;

	@Column(name = "uav")
	private double uav;

	/** The zone. */
	@ManyToOne
	@JoinColumn(name = "desc_id", insertable = false, updatable = false)
	@JsonIgnore
	private DescriptionTypeEntity descriptionTypeEntity;

}
