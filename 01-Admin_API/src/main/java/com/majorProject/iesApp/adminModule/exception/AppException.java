package com.majorProject.iesApp.adminModule.exception;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class AppException {

	private String exCode;
	private String exDec;
	private LocalDate exDate;
	public String getExCode() {
		return exCode;
	}
	public void setExCode(String exCode) {
		this.exCode = exCode;
	}
	public String getExDec() {
		return exDec;
	}
	public void setExDec(String exDec) {
		this.exDec = exDec;
	}
	public LocalDate getExDate() {
		return exDate;
	}
	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}

}
