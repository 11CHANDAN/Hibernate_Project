package com.ty.hospital_app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MedOrder 
{
	@Id
	@GeneratedValue
	private int medorder_id;
	private String doctorname;
	private String medorder_date;
	private int medorder_totalcost;
	@OneToMany(mappedBy="medorder")
	private List<Item>item;
	@ManyToOne
	@JoinColumn
	private Encounter encounter;
	
	public int getMedorder_id() {
		return medorder_id;
	}
	public void setMedorder_id(int medorder_id) {
		this.medorder_id = medorder_id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	
		public String getMedorder_date() {
		return medorder_date;
	}
	public void setMedorder_date(String medorder_date) {
		this.medorder_date = medorder_date;
	}
		public int getMedorder_totalcost() {
		return medorder_totalcost;
	}
	public void setMedorder_totalcost(int medorder_totalcost) {
		this.medorder_totalcost = medorder_totalcost;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	

}
