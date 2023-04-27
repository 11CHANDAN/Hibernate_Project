package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderDao 
{
	public MedOrder saveMedOrder(int eid,MedOrder medorder);
	public MedOrder getMedOrder(int mid);
	public boolean deleteMedOrder(int mid);
	public MedOrder updateMedOrder(int mid,MedOrder medorder);
	public List<MedOrder> getAllMedOrder();
	public List<MedOrder> getAllMedOrderByDoctorName(String name);
	public List<MedOrder> getAllMedOrderByDate(String date);
	
}
