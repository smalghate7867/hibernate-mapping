package com.tyss.bean.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tyss.bean.primary.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "EDUCATIONAL_INFO")
@SuppressWarnings("serial")
public class EducationalInfo implements Serializable{

	@EmbeddedId
	private EducationalDetailPKBean bean;
	@Column
	private String collegeName;
	@Column
	private String universityName;
	@Column
	private Date yop;
	@Column
	private String location;

}
