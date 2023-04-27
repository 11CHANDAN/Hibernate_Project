package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.MedOrder;

public class ItemDaoImp implements ItemDao
{

	public Item saveItem(int mid, Item item) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		MedOrder medorder=entityManager.find(MedOrder.class, mid);
		if(medorder!=null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();
			return item;
		}
		else
		{
			return null;
		}
	}

	public Item getItem(int iid) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Item item=entityManager.find(Item.class, iid);
		return item;
	}

	public boolean deleteItem(int iid)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item=entityManager.find(Item.class, iid);

		if(item!=null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int iid, Item item) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1=entityManager.find(Item.class, iid);
		if(item1!=null)
		{
			item.setItem_name(item.getItem_name());
			item.setItem_cost(item1.getItem_cost());
			item.setItem_quantity(item.getItem_quantity());
			return item;
		}
		else
		{
			return null;
		}
	}

	public List<Item> getAllItem()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from item s");
		List<Item>item=query.getResultList();


		return item;
	}


}
