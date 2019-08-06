package com.tyss.bean.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tyss.bean.primary.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Embeddable
@Data
public class EmployeeAddressCompositePKBean implements Serializable{

	@ManyToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	@Column
	private String addressType;
}
