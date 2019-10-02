package org.nextleaf.com.service;

import java.util.List;

import org.nextleaf.com.enity.VaichalInstall;

public interface VaichalInstalService {

	public VaichalInstall updateVaichalInstal(VaichalInstall model);
	public List<VaichalInstall> getAllVaichalDetails();
	public String getVaichalStatus(Long id);
	public List<VaichalInstall> getVaichalDetails(String from, String to);
	public void removeVaichalInstall(Long vid);
	
}
