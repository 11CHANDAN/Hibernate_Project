package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.HospitalDao;
import com.ty.hospital_app.dto.Hospital;

public class HospitalDaoImp implements HospitalDao
{

	public Hospital saveHospital(Hospital hospital) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();

		return hospital;
	}

	public Hospital getHospital(int hid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		return hospital;
	}

	public boolean deleteHospital(int hid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);

		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Hospital updateHospital(int hid, Hospital hospital) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Hospital hospital1=entityManager.find(Hospital.class,hid);

		if(hospital1!=null)
		{
			hospital1.setHospital_name(hospital.getHospital_name());
			hospital1.setHospital_website(hospital.getHospital_website());
			entityTransaction.begin();
			entityManager.merge(hospital1);
			entityTransaction.commit();
			return hospital;
		}
		else
		{
			return null; 
		}
	}

	public List<Hospital> getAllHospital() 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Hospital s");
		List<Hospital>hospital=query.getResultList();


		return hospital;
	}

}
