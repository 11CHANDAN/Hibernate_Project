package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemDao 
{
	public Item saveItem(int mid,Item item);
	public Item getItem(int iid);
	public boolean deleteItem(int iid );
	public Item updateItem(int iid,Item item);
	public List<Item> getAllItem();

}
