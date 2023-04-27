package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(int eid, Observation observation) 
	{
		ObservationDaoImp odaoImp=new ObservationDaoImp();
		Observation observation1=odaoImp.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("observation data saved successfully");
		}
		else
		{
			System.out.println("unfortunately observation data not found");
		}
	}
	
	public Observation getObservation(int oid)
	{
		ObservationDaoImp odaoImp=new ObservationDaoImp();
		Observation observation1=odaoImp.getObservation(oid);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteObservation(int oid)
	{
		ObservationDaoImp odaoImp=new ObservationDaoImp();
		boolean flag=odaoImp.deleteObservation(oid);
		if(flag)
		{
			System.out.println("data deleted successfully");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Observation updateObservation(int oid,Observation observation)
	{
		ObservationDaoImp odaoImp=new ObservationDaoImp();
		Observation observation1=odaoImp.updateObservation(oid, observation);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}

}
