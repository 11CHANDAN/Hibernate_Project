package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.MedOrderDaoImp;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderService 
{
	public void saveMedOrder(int eid, MedOrder medorder )
	{
		MedOrderDaoImp medDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medDaoImp.saveMedOrder(eid, medorder);
				
		if(medorder1!=null)
		{
		System.out.println("Medorder data saved");
		}
		else
		{
			System.out.println("unfortunately medorder not saved");
		}
	}
	
	public MedOrder getMedOrder(int mid)
	{
		MedOrderDaoImp medDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medDaoImp.getMedOrder(mid);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}

	}
	
	public void deleteMedOrder(int mid)
	{
		MedOrderDaoImp medDaoImp=new MedOrderDaoImp();
		boolean flag=medDaoImp.deleteMedOrder(mid);
		if(flag)
		{
			System.out.println("medorder data deleted");
		}
		else
		{
			System.out.println("medorder data not found" );
		}

	}
	
	public MedOrder updateMedOrder(int mid, MedOrder medorder) 
	{
		MedOrderDaoImp medDaoImp=new MedOrderDaoImp();
		MedOrder medorder1=medDaoImp.updateMedOrder(mid, medorder);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}

	}

}
