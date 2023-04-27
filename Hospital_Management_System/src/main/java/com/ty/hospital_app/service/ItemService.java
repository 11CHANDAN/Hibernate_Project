package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dao.imp.MedOrderDaoImp;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Item;

public class ItemService 
{

	public void saveItem(int mid, Item item)
	{
		ItemDaoImp itemDaoImp=new ItemDaoImp();
		Item item1=itemDaoImp.saveItem(mid, item);
		if(item1!=null)
		{
			System.out.println("data saved successfully");
		}
		else
		{
			System.out.println("unfortunately data not saved");
		}

	}

	public Item getItemById(int iid)
	{
		ItemDaoImp itemDaoImp=new ItemDaoImp();
		Item item1=itemDaoImp.getItem(iid);
		if(item1!=null)
		{
			return item1;
		}

		else
		{
			return null;
		}
	}

	public void deleteItem(int iid)
	{
		ItemDaoImp itemDaoImp=new ItemDaoImp();
		boolean flag=itemDaoImp.deleteItem(iid);

		if(flag)
		{
			System.out.println("Data deleted successfully");
		}
		else
		{
			System.out.println("data not found");
		}
	}

	public Item updateItem(int iid,Item item)
	{
		ItemDaoImp itemDaoImp=new ItemDaoImp();
		Item item1=itemDaoImp.updateItem(iid, item);
		if(item1!=null)
		{

			return item1;
		}
		else
		{
			return null;
		}
	}


}
