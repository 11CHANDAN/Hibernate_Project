package com.ty.hospital_app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Encounter 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int encounter_id;
	private String encounter_reason;
	private String dateofjoin;
	private String dateofdischarge;
	@OneToMany(mappedBy="encounter")
	private List<Observation>observation;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy="encounter")
	private List<MedOrder>medorder;
	@ManyToOne
	@JoinColumn
	private Person persons;
	
	public int getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(int encounter_id) {
		this.encounter_id = encounter_id;
	}
	public String getEncounter_reason() {
		return encounter_reason;
	}
	public void setEncounter_reason(String encounter_reason) {
		this.encounter_reason = encounter_reason;
	}
	
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	
	public String getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(String dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public List<Observation> getObservation() {
		return observation;
	}
	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrder> getMedorder() {
		return medorder;
	}
	public void setMedorder(List<MedOrder> medorder) {
		this.medorder = medorder;
	}
	public Person getPersons() {
		return persons;
	}
	public void setPersons(Person persons) {
		this.persons = persons;
	}
	
	
	

}
