package com.tyss.bean.model;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.bean.manytomany.TrainingInfoBean;
import com.tyss.bean.manytoone.EducationalInfo;
import com.tyss.bean.manytoone.EmployeeAddressBean;
import com.tyss.bean.manytoone.ExperianceInfoBean;
import com.tyss.bean.onetoone.EmployeeOtherInfoBean;
import com.tyss.bean.primary.EmployeeInfoBean;

public class HibernateImpl {

	private Configuration configuration = new Configuration();

	private SessionFactory sessionFactory = configuration.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean
			,List<EmployeeAddressBean> addressBean,List<EducationalInfo> educationalInfos,List<ExperianceInfoBean> experianceInfoBeans) {

		Session session = sessionFactory.openSession();

		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		//session.save(addressBean);
		for (EmployeeAddressBean employeeAddressBean : addressBean) {
			session.save(employeeAddressBean);
		}
		for (EducationalInfo educationalInfo : educationalInfos) {
			session.save(educationalInfo);
		}
		for (ExperianceInfoBean experianceInfoBean : experianceInfoBeans) {
			session.save(experianceInfoBean);
		}
		transaction.commit();
		session.close();
	}
	
	public void createTrainingInfo( List<TrainingInfoBean> trainingInfoBean) {
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		for (TrainingInfoBean trainingInfoBean2 : trainingInfoBean) {
			session.save(trainingInfoBean2);
		}
		
		transaction.commit();
		session.close();
		
		
	}
}
