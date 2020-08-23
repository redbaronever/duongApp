package com.duongApp.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {
	@Column(name="created_date", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@Column(name="created_by", nullable=false)
	private BigDecimal createdBy;
	
	@Column(name="updated_date", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;
	
	@Column(name="updated_by", nullable=false)
	private BigDecimal updatedBy;
	
	@Column(name="deleted_flag", nullable=false)
	private Boolean deletedFlag;
}
