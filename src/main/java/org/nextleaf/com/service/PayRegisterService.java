package org.nextleaf.com.service;

import java.util.List;

import org.nextleaf.com.enity.PayRegister;

public interface PayRegisterService {
	
	public PayRegister getBranchManager(Long id);
	public List<PayRegister> getBranchManagerByBranch(String branchName);
	public List<PayRegister> getAllBranchManager();	
	public PayRegister updateBranchManagerRec(PayRegister payRegister);
	public void removeBranchManager(Long id);

}
