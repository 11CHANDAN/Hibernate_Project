package com.ty.hospital_app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int person_id;
	private String person_name;
	private String person_address;
	private long person_phoneno;
	private int person_age;
	private String person_gender;
	private String person_dob;
	@OneToMany(mappedBy="persons")
	private List<Encounter>encounter;
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}
	public long getPerson_phoneno() {
		return person_phoneno;
	}
	public void setPerson_phoneno(long person_phoneno) {
		this.person_phoneno = person_phoneno;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}
	public String getPerson_gender() {
		return person_gender;
	}
	public void setPerson_gender(String person_gender) {
		this.person_gender = person_gender;
	}
	
	public String getPerson_dob() {
		return person_dob;
	}
	public void setPerson_dob(String person_dob) {
		this.person_dob = person_dob;
	}
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	

}
