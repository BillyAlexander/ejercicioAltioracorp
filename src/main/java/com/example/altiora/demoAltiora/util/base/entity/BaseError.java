package com.example.altiora.demoAltiora.util.base.entity;

public class BaseError {
	private String message;

	private boolean isCustom;

	public String getMessage() {
		return message;
	}

	public BaseError(String message) {
		this.message = message;
		this.isCustom = false;
	}

	public BaseError(String message, boolean isCustom) {
		this.message = message;
		this.isCustom = isCustom;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isCustom() {
		return isCustom;
	}

	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}
	
	

}
