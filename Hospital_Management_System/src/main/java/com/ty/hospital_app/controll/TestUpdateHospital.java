package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital 
{
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		HospitalService service=new HospitalService();
		hospital.setHospital_name("newjayadev");
		hospital.setHospital_website("www.newjayadev.com");
		service.updateHospital(1, hospital);
	}

}
