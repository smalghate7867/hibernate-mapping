package com.tyss.bean.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tyss.bean.primary.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_ADDRESS_INFO")
@SuppressWarnings("serial")
public class EmployeeAddressBean implements Serializable {
	
	@EmbeddedId
	private EmployeeAddressCompositePKBean addressPKBean;
	
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String landmark;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private int pincode;

}
