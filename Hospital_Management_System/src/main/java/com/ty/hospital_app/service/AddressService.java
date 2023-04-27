package com.ty.hospital_app.service;


import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;

public class AddressService 
{
	public void saveAddress(int bid,Address address)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.saveAddress(bid, address);
		if(address1!=null)
		{
			System.out.println("Data saved successfully");
		}
		else
		{
			System.out.println("unfortunately data not saved");
		}
	}
	
	public Address getAddressById(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.getAddress(aid);
		if(address1!=null)
		{

			return address1;

		}
		else
		{
			return null;
		}
	}
	
	public void deleteAddress(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean flag =daoImp.deleteAddress(aid);
		if(flag)
		{
			System.out.println("data deleted successfully");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Address updateAddress(int aid, Address address)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.getAddress(aid);
		if(address1!=null)
		{

			return address1;

		}
		else
		{
			return null;
		}
	}

}
