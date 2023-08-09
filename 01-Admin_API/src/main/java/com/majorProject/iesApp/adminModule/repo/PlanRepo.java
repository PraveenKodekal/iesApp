package com.majorProject.iesApp.adminModule.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.majorProject.iesApp.adminModule.entity.PlansEntity;

@Repository
public interface PlanRepo extends JpaRepository<PlansEntity, Integer>{

	@Query("update PlansEntity set planStatus=:status where planId=:planId")
	public Integer updatePlanStatus(Integer planId, String status);
}
