package com.majorProject.iesApp.adminModule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majorProject.iesApp.adminModule.binding.PlanForm;
import com.majorProject.iesApp.adminModule.repo.PlanRepo;
import com.majorProject.iesApp.adminModule.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{

	@Autowired
	private PlanRepo repo;

	@Override
	public boolean createPlan(PlanForm form) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PlanForm> fetchPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanForm planEditById(Integer planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePlanStatus(Integer planId, String planStatus) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
