package com.main.sys.role.model;

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
import com.main.sys.user.model.UserEntity;

/**
 * 
 * Title:   RoleEntity.java
 * Description:��ɫ   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2016��3��18������3:58:14
 * @version  1.0
 */
@Entity
@Table(name="sys_role")
public class RoleEntity extends BaseEntity{

	private Long id;
	@NotNull(message="��ɫ���Ʋ���Ϊ��!")
	@Max(value=50)
	private String roleName; 	//��ɫ������
	private String enRoleName;  //��ɫӢ����
	private List<UserEntity> users; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="roleName")
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Column(name="en_roleName")
	public String getEnRoleName() {
		return enRoleName;
	}
	public void setEnRoleName(String enRoleName) {
		this.enRoleName = enRoleName;
	}
	@ManyToMany
	@JoinTable(name="sys_user_role",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="role_id")})  
	public List<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
	
	
}
