package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.User;

public class UserDaoImp implements UserDao
{

	public User saveUser(User user) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUser(int uid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=entityManager.find(User.class, uid);
		
				return user;
	}

	public boolean deleteUser(int uid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user=entityManager.find(User.class, uid);

		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else
		{

				return false;
		}
	}

	public User updateUser(int uid, User user)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		User user1=entityManager.find(User.class, uid);
		if(user1!=null)
		{
			user.setUser_name(user1.getUser_name());
			user.setUser_email(user1.getUser_email());
			user.setUser_phoneno(user1.getUser_phoneno());
			user.setUser_password(user1.getUser_password());
			user.setUser_role(user1.getUser_role());
			return user;
		}
		else
		{
				return null;
		}
	}

	public List<User> getAllUser()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from User s");
		List<User>user=query.getResultList();
				return user;
	}

	public List<User> getUserByRole(String role) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select role from User s");
		List<User>user=query.getResultList();
				return user;
	}
	

}
