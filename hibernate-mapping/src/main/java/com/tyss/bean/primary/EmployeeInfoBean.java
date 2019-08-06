package com.tyss.bean.primary;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMPLOYEE_INFO")
@Data
@ToString
public class EmployeeInfoBean implements Serializable{
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String gender;
	@Column
	private double salary;
	@Column
	private long phone;
	@Column
	private String email;
	@Column
	private String designation;
	@Column
	private Date dob;
	@Column
	private long accNum;
	@Column
	private Date joiningDate;
	@Column
	private int deptId;
	@Column
	private String password;
	@ManyToOne
	@JoinColumn(name="mngrId",referencedColumnName = "id")
	private EmployeeInfoBean mngrId;

}
