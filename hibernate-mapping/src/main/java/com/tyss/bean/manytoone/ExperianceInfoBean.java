package com.tyss.bean.manytoone;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EXPERIENCE_INFO")
@SuppressWarnings("serial")
public class ExperianceInfoBean {
	@EmbeddedId
	private ExperianceInfoComositePKBean infoComositePKBean;
	@Column
	private String designation;
	@Column
	private Date joiningDate;
	@Column
	private Date leavingDate;

}
