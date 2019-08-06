package com.tyss.bean.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tyss.bean.primary.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMPLOYEE_OTHER_INFO")
@Data
@ToString
public class EmployeeOtherInfoBean implements Serializable{
	@Id
	@OneToOne 
	@JoinColumn(name = "id")
	//@PrimaryKeyJoinColumn(name="id")
	//or @ID and @JoinCol
	private EmployeeInfoBean infoBean;
	@Column
	private String pan;
	@Column
	private boolean isMarried;
	@Column
	private long aadhar;
	@Column
	private String bloodGroup;
	@Column
	private boolean isChalanged;
	@Column
	private long emergencyNumber;
	@Column
	private String emergencyContactName;
	@Column
	private String nationality;
	@Column
	private String religion;
	@Column
	private String fathersName;
	@Column
	private String mothersName;
	@Column
	private String spouseName;

}
