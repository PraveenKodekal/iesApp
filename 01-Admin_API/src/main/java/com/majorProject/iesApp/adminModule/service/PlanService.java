package com.majorProject.iesApp.adminModule.service;

import java.util.List;

import com.majorProject.iesApp.adminModule.binding.PlanForm;

public interface PlanService {
	
	
	public boolean createPlan(PlanForm form);
	
	// view plans
	public List<PlanForm> fetchPlans();
	
	// to update and edit
	public PlanForm planEditById(Integer planId);
	
	
	// to activate or decativate the plan
	public String changePlanStatus(Integer planId, String planStatus);
	

}
