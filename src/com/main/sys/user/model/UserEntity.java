package com.main.sys.user.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.main.sys.base.model.BaseEntity;
import com.main.sys.role.model.RoleEntity;

/**
 * 
 * Title:   User
 * Description:�û�   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2016��3��18������3:33:21
 * @version  1.0
 */
@Entity
@Table(name="sys_user")
public class UserEntity extends BaseEntity{

	private Long id;
	@NotNull(message="��¼������Ϊ��!")
	@Max(value=50)
	private String loginName;     //��¼��
	@NotNull(message="���벻��Ϊ��!")
	private String password;	  //����
	private String userName;	  //�û���
	private String mobile;        //�ֻ�
	private String email;	      //����
	private String imgUrl;        //ͷ��Url
	private String remark;        //��ע
	private List<RoleEntity> roles;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="login_name",length=50)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Column(name="password",length=100)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="userName",length=50)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="mobile")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 @ManyToMany  
	 @JoinTable(name="sys_user_role",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="role_id")})  
	public List<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	@Column(name="img_url")
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Column(name="remark")
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
