package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalDao 
{
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospital(int hid );
	public boolean deleteHospital(int hid );
	public Hospital updateHospital(int hid,Hospital hospital);
	public List<Hospital> getAllHospital();



}
