package org.nextleaf.com.repository;

import org.nextleaf.com.enity.QuickContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuickContactRepository extends JpaRepository<QuickContact, Long>{

}
