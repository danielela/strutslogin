package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bean.LoginBean;

public class LoginAction extends Action{

	public LoginAction() {
		System.out.println("Inside the action class constructor");
	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ActionForward aForward=null;
		
		LoginBean lBean=(LoginBean) form;
		
		
		String userid=lBean.getUserId();
		String password=lBean.getPwd();
		System.out.println("The Userid and password ="+userid+" password="+password);
		if(userid.equalsIgnoreCase(password)){
			aForward=mapping.findForward("successLogin");
		}
		else{
			lBean.reset(mapping, request);
			aForward=mapping.getInputForward();
		}
		
		
		return aForward;
		
	}
	
}
