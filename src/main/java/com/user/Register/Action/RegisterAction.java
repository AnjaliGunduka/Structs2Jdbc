package com.user.Register.Action;

import org.Admin.dao.Admin;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uname, uemail, upass, udeg;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUdeg() {
		return udeg;
	}
	public void setUdeg(String udeg) {
		this.udeg = udeg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public int getCtr() {
		return ctr;
	}
	public void setCtr(int ctr) {
		this.ctr = ctr;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String msg = "";
	Admin admin = null;
	int ctr = 0;
	@Override
	public String execute() throws Exception {
		admin = new Admin();

		try {
			ctr = admin.registerUser(uname, uemail, upass, udeg);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Some error";
			}	
}
		 catch (Exception e) {
				e.printStackTrace();
			}
			return "REGISTER";	
	}
		
}

