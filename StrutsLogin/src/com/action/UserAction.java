package com.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import com.bean.LoginBean;
import com.bean.UserRegisterBean;

public class UserAction extends LookupDispatchAction{

	@Override
	protected Map getKeyMethodMap() {
		System.out.println("Inside the getKeyMethodMap");
		Map map=new HashMap();
		map.put("button.search", "searchUser");
		map.put("button.update", "updateUser");
		
		return map;
	}
	

	public ActionForward searchUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ActionForward actFwd=null;
		System.out.println("inside the search function ");
		UserRegisterBean userBean=(UserRegisterBean) form;
		String fname=userBean.getFname();
		userBean.setLname("Ela");
		userBean.setEmail("daniel@gmail.com");
		userBean.setMobile("12345667889");
		actFwd=mapping.getInputForward();
		return actFwd;
	}

	public ActionForward updateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActionForward actFwd=null;
		UserRegisterBean userBean=(UserRegisterBean) form;
		String fname=userBean.getFname();
		String lname=userBean.getLname();
		
		
		System.out.println("Inside the update function");
		
		actFwd=mapping.findForward("success");
		return actFwd;
	}
}
