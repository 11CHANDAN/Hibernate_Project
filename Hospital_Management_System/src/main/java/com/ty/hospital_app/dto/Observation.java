package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Observation 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int observation_id;
	private String doctorname;
	private String reasonobservation;
	@ManyToOne
	@JoinColumn
	private Encounter encounter;
	
	public int getObservation_id() {
		return observation_id;
	}
	public void setObservation_id(int observation_id) {
		this.observation_id = observation_id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getReasonobservation() {
		return reasonobservation;
	}
	public void setReasonobservation(String reasonobservation) {
		this.reasonobservation = reasonobservation;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	
	

}
