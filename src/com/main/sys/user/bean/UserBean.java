package com.main.sys.user.bean;

/**
 * 
 * Title:   UserBean.java
 * Description:用户Bean   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2016年3月18日下午5:16:43
 * @version  1.0
 */
public class UserBean {

	private Long Id;
	private String userName;
	private String loginName;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
}
