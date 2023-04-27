package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao
{

	public Person savePerson(int eid, Person person) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;

		}

	}

	public Person getPerson(int pid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();


		Person person=entityManager.find(Person.class, pid);
		return person;
	}

	public boolean deletePerson(int pid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;

		}
	}

	public Person updatePerson(int pid, Person person)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person person1=entityManager.find(Person.class, pid);
		if(person1!=null)
		{
			person.setPerson_name(person1.getPerson_name());
			person.setPerson_gender(person1.getPerson_name());
			person.setPerson_address(person1.getPerson_address());
			person.setPerson_dob(person1.getPerson_dob());
			person.setPerson_age(person1.getPerson_age());
			person.setPerson_phoneno(person1.getPerson_phoneno());
			return person;
		}
		return null;
	}

	public List<Person> getAllPerson() 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from person s");
		List<Person>person=query.getResultList();

		return person;
	}

	public List<Person> getPersonByGender(String gender) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from person s where gender=?1");
		query.setParameter(1, gender);
		List<Person>person=query.getResultList();

		return person;


	}

	public List<Person> getPersonByAge(int age) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from person s where age=?1");
		query.setParameter(1,age);
		List<Person>person=query.getResultList();

		return person;


	}

	public List<Person> getPersonByPhone(long phoneno)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select phoneno from person s");
		List<Person>person=query.getResultList();

		return person;

	}


}
