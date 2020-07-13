package com.mindtree.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode
@Data
@Table(name = "description")
public class DescriptionTypeEntity {

	/** The desc id. */
	@Id
	@Column(name = "desc_id")
	private int descId;

	/** The desc type. */
	@Column(name = "desc_name")
	private String descType;

	/** The zone. */
	@ManyToOne
	@JoinColumn(name = "zone_id", insertable = false, updatable = false)
	@JsonIgnore
	private ZoneEntity zone;

	@OneToMany(mappedBy = "descriptionTypeEntity")
	private List<PropertyEntity> propertyEntities;

}
