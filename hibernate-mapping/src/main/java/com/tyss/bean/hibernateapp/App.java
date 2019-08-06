package com.tyss.bean.hibernateapp;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.tyss.bean.manytomany.TrainingInfoBean;
import com.tyss.bean.manytoone.EducationalDetailPKBean;
import com.tyss.bean.manytoone.EducationalInfo;
import com.tyss.bean.manytoone.EmployeeAddressBean;
import com.tyss.bean.manytoone.EmployeeAddressCompositePKBean;
import com.tyss.bean.manytoone.ExperianceInfoBean;
import com.tyss.bean.manytoone.ExperianceInfoComositePKBean;
import com.tyss.bean.model.HibernateImpl;
import com.tyss.bean.onetoone.EmployeeOtherInfoBean;
import com.tyss.bean.primary.EmployeeInfoBean;

public class App {
	public static void main(String[] args) {

		// one to one
		EmployeeInfoBean bean = new EmployeeInfoBean();
		// bean.setId(9);
		bean.setAccNum(1232323);
		bean.setAge(22);
		bean.setDeptId(1);
		bean.setDesignation("Automation");
		bean.setDob(new Date());
		bean.setEmail("riya@gmail.com");
		bean.setGender("M");
		bean.setJoiningDate(new Date());
		// bean.setMngrId(1);
		//many to many
		bean.setMngrId(bean);
		bean.setName("Dinu");
		bean.setPassword("1234");
		bean.setPhone(12345);
		bean.setSalary(600000);

		EmployeeInfoBean bean1 = new EmployeeInfoBean();
		// bean.setId(9);
		bean1.setAccNum(1232323);
		bean1.setAge(22);
		bean1.setDeptId(2);
		bean1.setDesignation("Test");
		bean1.setDob(new Date());
		bean1.setEmail("ranji@gmail.com");
		bean1.setGender("M");
		bean1.setJoiningDate(new Date());
		// bean1.setMngrId(1);
		bean1.setMngrId(bean1);
		bean1.setName("Dinu");
		bean1.setPassword("1234");
		bean1.setPhone(12345);
		bean1.setSalary(600000);

		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setInfoBean(bean1);
		otherInfoBean.setAadhar(123456564);
		otherInfoBean.setBloodGroup("o+");
		otherInfoBean.setChalanged(false);
		otherInfoBean.setEmergencyContactName("riya");
		otherInfoBean.setEmergencyNumber(1234578978);
		otherInfoBean.setFathersName("Dad");
		otherInfoBean.setMothersName("mom");
		otherInfoBean.setMarried(false);
		otherInfoBean.setNationality("INDIAN");
		otherInfoBean.setPan("PAN123531");
		otherInfoBean.setReligion("Hindu");
		otherInfoBean.setSpouseName("NA");

		// many to one
		/// For address
		EmployeeAddressCompositePKBean addressCompositePKBean = new EmployeeAddressCompositePKBean();
		addressCompositePKBean.setAddressType("TEMP444");
		addressCompositePKBean.setInfoBean(bean1);

		EmployeeAddressCompositePKBean addressCompositePKBean1 = new EmployeeAddressCompositePKBean();
		addressCompositePKBean1.setAddressType("PERM444");
		addressCompositePKBean1.setInfoBean(bean1);/// Multiple address same emp one to many

		EmployeeAddressBean addressBean = new EmployeeAddressBean();

		addressBean.setAddress1("Line 444");
		addressBean.setAddress2("Line 444");
		addressBean.setCity("Mumbai");
		addressBean.setCountry("INDIA");
		addressBean.setLandmark("Meera ROAD");
		addressBean.setPincode(550076);
		addressBean.setState("maharashtra");

		addressBean.setAddressPKBean(addressCompositePKBean);

		EmployeeAddressBean addressBean1 = new EmployeeAddressBean();

		addressBean1.setAddress1("Line 444");
		addressBean1.setAddress2("Line 444");
		addressBean1.setCity("Mumbai");
		addressBean1.setCountry("INDIA");
		addressBean1.setLandmark("Meera ROAD");
		addressBean1.setPincode(550076);
		addressBean1.setState("maharashtra");

		addressBean1.setAddressPKBean(addressCompositePKBean1);
		// many to one
		/// For educational Info

		EducationalDetailPKBean educationalDetailPKBean = new EducationalDetailPKBean();
		educationalDetailPKBean.setEducationalType("FULL TIME111");
		educationalDetailPKBean.setInfoBean(bean1);

		EducationalDetailPKBean educationalDetailPKBean1 = new EducationalDetailPKBean();
		educationalDetailPKBean1.setEducationalType("PART TIME111");
		educationalDetailPKBean1.setInfoBean(bean1);

		EducationalInfo educationalInfo = new EducationalInfo();
		educationalInfo.setCollegeName("KITS");
		educationalInfo.setLocation("MUMBAI");
		educationalInfo.setUniversityName("MUMBAI INI");
		educationalInfo.setYop(new Date());
		educationalInfo.setBean(educationalDetailPKBean);

		EducationalInfo educationalInfo1 = new EducationalInfo();
		educationalInfo1.setCollegeName("KITS");
		educationalInfo1.setLocation("MUMBAI");
		educationalInfo1.setUniversityName("MUMBAI INI");
		educationalInfo1.setYop(new Date());

		educationalInfo1.setBean(educationalDetailPKBean1);
		// many to one
		/// For experiance Info

		ExperianceInfoComositePKBean comositePKBean = new ExperianceInfoComositePKBean();
		comositePKBean.setCompanyName("CERNERR");
		comositePKBean.setInfoBean(bean1);

		ExperianceInfoComositePKBean comositePKBean1 = new ExperianceInfoComositePKBean();
		comositePKBean1.setCompanyName("TYSSS");
		comositePKBean1.setInfoBean(bean1);

		ExperianceInfoComositePKBean comositePKBean2 = new ExperianceInfoComositePKBean();
		comositePKBean2.setCompanyName("Kuberaa");
		comositePKBean2.setInfoBean(bean1);

		ExperianceInfoBean experianceInfoBean = new ExperianceInfoBean();
		experianceInfoBean.setDesignation("ruby devep");
		experianceInfoBean.setJoiningDate(new Date());
		experianceInfoBean.setLeavingDate(new Date());
		experianceInfoBean.setInfoComositePKBean(comositePKBean);

		ExperianceInfoBean experianceInfoBean1 = new ExperianceInfoBean();
		experianceInfoBean1.setDesignation("Java devep");
		experianceInfoBean1.setJoiningDate(new Date());
		experianceInfoBean1.setLeavingDate(new Date());
		experianceInfoBean1.setInfoComositePKBean(comositePKBean1);

		ExperianceInfoBean experianceInfoBean2 = new ExperianceInfoBean();
		experianceInfoBean2.setDesignation("Software Engineer");
		experianceInfoBean2.setJoiningDate(new Date());
		experianceInfoBean2.setLeavingDate(new Date());
		experianceInfoBean2.setInfoComositePKBean(comositePKBean2);

		// many to many
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseName("JAVA");
		trainingInfoBean.setCourseType("FULL TIME");

		trainingInfoBean.setInfoBeans(Arrays.asList(bean, bean1));

		TrainingInfoBean trainingInfoBean1 = new TrainingInfoBean();
		trainingInfoBean1.setCourseName("ANGULAR");
		trainingInfoBean1.setCourseType("PART TIME");

		trainingInfoBean1.setInfoBeans(Arrays.asList(bean, bean1));

		HibernateImpl hibernateImpl = new HibernateImpl();

		hibernateImpl.createTrainingInfo(Arrays.asList(trainingInfoBean, trainingInfoBean1));
		/*
		 * ArrayList<EmployeeAddressBean> list = new ArrayList<EmployeeAddressBean>();
		 * list.add(addressBean); list.add(addressBean1);
		 * hibernateImpl.createEmployee(bean, otherInfoBean, list);
		 */
		hibernateImpl.createEmployee(bean1, otherInfoBean, Arrays.asList(addressBean, addressBean1),
				Arrays.asList(educationalInfo, educationalInfo1),
				Arrays.asList(experianceInfoBean, experianceInfoBean1, experianceInfoBean2));
	}
}