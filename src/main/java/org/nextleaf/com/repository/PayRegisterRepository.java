package org.nextleaf.com.repository;

import java.util.List;
import java.util.Optional;

import org.nextleaf.com.enity.PayRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRegisterRepository extends JpaRepository<PayRegister,Long>{

	Optional<List<PayRegister>> findByBranch(String branchName);

}
