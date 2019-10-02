package org.nextleaf.com.service.impl;

import java.util.List;

import org.nextleaf.com.enity.VaichalInstall;
import org.nextleaf.com.repository.VaichalInstalRepository;
import org.nextleaf.com.service.VaichalInstalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class VaichalInstalServiceImpl implements VaichalInstalService {
	
	@Autowired
	private VaichalInstalRepository vaichalInstalRepository;
	
	@Override
	public VaichalInstall updateVaichalInstal(VaichalInstall model) {
		return vaichalInstalRepository.save(model);
	}

	@Override
	public List<VaichalInstall> getAllVaichalDetails() {
		return vaichalInstalRepository.findAll();
	}

	@Override
	public String getVaichalStatus(Long id) {
		return vaichalInstalRepository.findByStatus(id);
	}

	@Override
	public List<VaichalInstall> getVaichalDetails(String from, String to) {
		return vaichalInstalRepository.fetchVaichalBtwFrmTo(from,to);
	}

	@Override
	public void removeVaichalInstall(Long vid) {
		vaichalInstalRepository.deleteById(vid);
	}

}
