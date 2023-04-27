package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.BranchService;

public class TestSaveBranch {
	public static void main(String[] args) {
		Branch branch=new Branch();
		Hospital hospital=new Hospital();
		BranchService service=new BranchService();
		branch.setBranch_name("Basveshwara");
		branch.setBranch_phoneno(6362116501l);
		branch.setBranch_email("basava@gail.com");
		branch.setHospital(hospital);
		service.saveBranch(branch, 1);
	}
}
