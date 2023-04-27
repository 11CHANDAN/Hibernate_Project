package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dto.Branch;

public class BranchService
{
	public void saveBranch(Branch branch,int hid)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		Branch branch2=branchDaoImp.saveBranch(hid, branch);
		if(branch2!=null)
		{
			System.out.println("Branch saved");
		}
		else
		{
			System.out.println("unfortunately Branch not saved");
		}
	}
	
	public Branch getBranchById(int bid)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		Branch branch2=branchDaoImp.getBranch(bid);
		if(branch2!=null)
		{
			return branch2;
		}
		else
		{
			return null;
		}
	}
	
	public void deleteHospital(int bid)
	{
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		boolean flag=branchDaoImp.deleteBranch(bid);
		if(flag)
		{
			System.out.println("Data deleted successfully");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Branch updateBranch(int bid,Branch branch)
	{
        BranchDaoImp branchDaoImp=new BranchDaoImp();
		
		Branch branch2=branchDaoImp.updateBranch(bid, branch);
		if(branch2!=null)
		{
			return branch;
		}
		else
		{
			return null;
		}
	}

}
