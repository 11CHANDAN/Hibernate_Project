package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Branch 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branch_id;
	private String branch_name;
	private long branch_phoneno;
	private String branch_email;
	@JoinColumn
	@ManyToOne
	private Hospital hospital;
	@OneToOne
	private Address address;
	@OneToMany(mappedBy="branch")
	private List<Encounter>encounter;
	
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public long getBranch_phoneno() {
		return branch_phoneno;
	}
	public void setBranch_phoneno(long branch_phoneno) {
		this.branch_phoneno = branch_phoneno;
	}
	public String getBranch_email() {
		return branch_email;
	}
	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	
}
