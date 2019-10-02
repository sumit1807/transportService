package org.nextleaf.com.service.impl;

import java.util.List;

import org.nextleaf.com.enity.PayRegister;
import org.nextleaf.com.repository.PayRegisterRepository;
import org.nextleaf.com.service.PayRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PayRegisterServiceImpl implements PayRegisterService {
	
	@Autowired
    private PayRegisterRepository payRegisterRepository;
	
	
	@Override
	public PayRegister getBranchManager(Long id) {
		return payRegisterRepository.findById(id).get();
	}

	@Override
	public List<PayRegister> getBranchManagerByBranch(String branchName) {
		return payRegisterRepository.findByBranch(branchName).get();
	}

	@Override
	public List<PayRegister> getAllBranchManager() {
		return payRegisterRepository.findAll();
	}

	@Override
	public PayRegister updateBranchManagerRec(PayRegister payRegister) {
		return payRegisterRepository.save(payRegister);
	}

	@Override
	public void removeBranchManager(Long id) {
		payRegisterRepository.deleteById(id);
	}

}
