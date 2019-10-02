package org.nextleaf.com.service;

import java.util.List;

import org.nextleaf.com.enity.QuickContact;

public interface QuickContactService {
    
	public QuickContact getQuickContact(Long id);
	public List<QuickContact> getAllQuickContact();
	public QuickContact updateQuickContact(QuickContact model);
	public void removeQuickContact(Long id);
}
