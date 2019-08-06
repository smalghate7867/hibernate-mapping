package com.tyss.bean.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tyss.bean.primary.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "TRAINING_INFO")
@Data
public class TrainingInfoBean implements Serializable{
	@Id
	@GeneratedValue
	@Column
	private int courseId;
	@Column  
	private String courseName;
	@Column 
	private String courseType;	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EMPLOYEE_TRAINING_INFO",
	joinColumns = {@JoinColumn(name="courseId")}
	, inverseJoinColumns = {@JoinColumn(name="id")})
	private List<EmployeeInfoBean> infoBeans;
	
}
