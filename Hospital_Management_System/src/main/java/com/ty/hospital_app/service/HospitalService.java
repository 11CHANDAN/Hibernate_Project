package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService
{
	public void saveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();

		Hospital hospital1=daoImp.saveHospital(hospital);
		if(hospital1!=null)
		{
			System.out.println("Data Saved Successfully");	
		}
		else
		{
			System.out.println("Unfortunately data not saved");
		}
	}

	public Hospital getHospitalById(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();

		Hospital hospital1=daoImp.getHospital(hid);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}

	public void deleteHospital(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();

		boolean flag=daoImp.deleteHospital(hid);
		if(flag)
		{
			System.out.println("Data deleted Successfully");	
		}
		else
		{
			System.out.println("Unfortunately data not found");
		}
	}


	public Hospital updateHospital(int hid,Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();

		Hospital hospital1=daoImp.updateHospital(hid,hospital);
		if(hospital1!=null)
		{
			return hospital1;	
		}
		else
		{
			return null;
		}
	}



}
