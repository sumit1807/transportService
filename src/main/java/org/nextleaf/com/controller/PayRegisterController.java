package org.nextleaf.com.controller;

import java.util.List;

import org.nextleaf.com.enity.PayRegister;
import org.nextleaf.com.service.impl.PayRegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payRegister")
public class PayRegisterController {
	
	@Autowired
	private PayRegisterServiceImpl payRegisterServiceImpl;
	
	@GetMapping(value = "")	
	public List<PayRegister> getBranchManagerList(){
		
		return payRegisterServiceImpl.getAllBranchManager();
	}
	
	@GetMapping(value = "/{id}")	
	public PayRegister getBranchManager(@PathVariable Long id){
		return payRegisterServiceImpl.getBranchManager(id);
	}
	
	@PostMapping(value = "")
	public PayRegister saveBranchManager(@RequestBody PayRegister entity) {
		return payRegisterServiceImpl.updateBranchManagerRec(entity);
	}
	
	@DeleteMapping(value = "/{id}")
	public String removeBranchManager(@PathVariable Long id) {
		payRegisterServiceImpl.removeBranchManager(id);
		return "Success";
	}
	
	@PutMapping(value="/{branchName}")
    public List<PayRegister> getBranchManagers(@PathVariable String branchName){
		return payRegisterServiceImpl.getBranchManagerByBranch(branchName);
	}


}
