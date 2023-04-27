package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService 
{

	public void savePerson(int eid, Person person)
	{
		PersonDaoImp pdaoImp=new PersonDaoImp();
		Person person1=pdaoImp.savePerson(eid, person);
		if(person1!=null)
		{
			System.out.println("person data saved successfully");
		}
		else
		{
			System.out.println("unfortunately data not saved");
		}
	}
	
	public Person getPersonById(int pid)
	{
		PersonDaoImp pdaoImp=new PersonDaoImp();
		Person person1=pdaoImp.getPerson(pid);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	
	public void deletePerson(int pid)
	{
		PersonDaoImp pdaoImp=new PersonDaoImp();
		boolean flag=pdaoImp.deletePerson(pid);
		if(flag)
		{
			System.out.println("data deleted successfully");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Person updatePerson(int pid, Person person)
	{
		PersonDaoImp pdaoImp=new PersonDaoImp();
		Person person1=pdaoImp.updatePerson(pid, person);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
}
