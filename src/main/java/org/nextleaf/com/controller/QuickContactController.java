package org.nextleaf.com.controller;

import java.util.List;

import org.nextleaf.com.enity.QuickContact;
import org.nextleaf.com.service.impl.QuickContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/quickContact")
public class QuickContactController {

	@Autowired
	private QuickContactServiceImpl quickContactServiceImpl;
	
	
	@GetMapping(value = "")
	public List<QuickContact> getQuickContactList() {
		return quickContactServiceImpl.getAllQuickContact();
	}
    
	@GetMapping(value = "/{id}")
	public QuickContact getQuickContact(@PathVariable Long id) {
		return quickContactServiceImpl.getQuickContact(id);
	}
	
	@PostMapping(value = "")
	public QuickContact postMethodName(@RequestBody QuickContact entity) {
		return quickContactServiceImpl.updateQuickContact(entity);
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteQuickContact(@PathVariable Long id) {
		quickContactServiceImpl.removeQuickContact(id);
		return "Success";
	}


	
	
	
}
