package org.nextleaf.com.service.impl;

import java.util.List;

import org.nextleaf.com.enity.QuickContact;
import org.nextleaf.com.repository.QuickContactRepository;
import org.nextleaf.com.service.QuickContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuickContactServiceImpl implements QuickContactService {

	@Autowired
    private QuickContactRepository  quickContactRepository;
	
	@Override
	public QuickContact getQuickContact(Long id) {
		return quickContactRepository.findById(id).get();
	}

	@Override
	public List<QuickContact> getAllQuickContact() {
		return quickContactRepository.findAll();
	}

	@Override
	public QuickContact updateQuickContact(QuickContact model) {
		return quickContactRepository.save(model);
	}

	@Override
	public void removeQuickContact(Long id) {
		// TODO Auto-generated method stub
		quickContactRepository.deleteById(id);
	}

	

}
