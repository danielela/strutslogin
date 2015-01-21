package com.bean;

import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginBean extends ActionForm{

	String userId;
	
	String pwd;
	String country;
	
	ArrayList countryList;
	
	public LoginBean() {
		System.out.println("inside the LoginbeaN CONSTRUCTOR");
		countryList=new ArrayList();
		
		countryList.add("India");
		countryList.add("USA");
		countryList.add("Europe");
		countryList.add("Japan");
		userId="Enter User ID";
	}
	
	public ArrayList getCountryList() {
		return countryList;
	}
	public void setCountryList(ArrayList countryList) {
		this.countryList = countryList;
	}

	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		userId="";
		pwd="";
	}
	
}
