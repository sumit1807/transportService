package org.nextleaf.com.repository;

import java.util.List;

import org.nextleaf.com.enity.VaichalInstall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VaichalInstalRepository extends JpaRepository<VaichalInstall, Long> {

	public String findByStatus(Long id);
	
	@Query("SELECT u FROM VaichalInstall u WHERE u.vFrom = ?1 and u.vTo = ?2")
	public List<VaichalInstall> fetchVaichalBtwFrmTo(String from, String to);

}
