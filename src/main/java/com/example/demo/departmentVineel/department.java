package com.example.demo.departmentVineel;

import nonapi.io.github.classgraph.json.Id;

public class department {
	@Id
	public String _id;
	
	private String DEPARTMENT_ID; 
	private String DEPARTMENT_NAME;
	private String MANAGER_ID;
	private String LOCATION_ID;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(String dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public String getDEPARTMENT_NAME() {
		return DEPARTMENT_NAME;
	}
	public void setDEPARTMENT_NAME(String dEPARTMENT_NAME) {
		DEPARTMENT_NAME = dEPARTMENT_NAME;
	}
	public String getMANAGER_ID() {
		return MANAGER_ID;
	}
	public void setMANAGER_ID(String mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	public String getLOCATION_ID() {
		return LOCATION_ID;
	}
	public void setLOCATION_ID(String lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}
	
	
}
