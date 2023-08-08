package com.majorProject.iesApp.adminModule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.majorProject.iesApp.adminModule.entity.EligibilityEntity;

@Repository
public interface EligibleRepo extends JpaRepository<EligibilityEntity, Integer> {

	
}
