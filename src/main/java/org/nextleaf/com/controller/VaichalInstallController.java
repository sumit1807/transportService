package org.nextleaf.com.controller;

import java.util.List;

import org.nextleaf.com.enity.VaichalInstall;
import org.nextleaf.com.service.impl.VaichalInstalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/vaichalInstall")
public class VaichalInstallController {
	
	@Autowired
	private VaichalInstalServiceImpl vaichalInstalService;
	
	@GetMapping(value = "")
	public List<VaichalInstall> getVaichalDetailList() {
		return vaichalInstalService.getAllVaichalDetails();
	}

	@GetMapping(value = "/{id}")
	public String getVaichalStatus(@PathVariable Long id) {
		return vaichalInstalService.getVaichalStatus(id);
	}
	
	@PostMapping(value = "")
	public VaichalInstall saveVaichalInstall(@RequestBody VaichalInstall entity) {
		return vaichalInstalService.updateVaichalInstal(entity);
	}
	
	@DeleteMapping(value = "/{id}")
	public String removeVaichalDetails(@PathVariable Long id) {
		vaichalInstalService.removeVaichalInstall(id);
		return "Success";
	}

    @PutMapping(value = "")
	public List<VaichalInstall> putMethodName(@RequestParam String from, @RequestParam String to) {
		return vaichalInstalService.getVaichalDetails(from,to);
	}


}
