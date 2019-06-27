package com.itzl.pojo;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Role {
	private Integer id;
	private Integer rId;
	private String roleName;
	/*
	 * 一个角色拥有多个权限
	 * 我们在查询Role的时候可以让mybatis级联给我查询他对应的所有的Power
	 */
	private List<Power> powers;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", rid=" + rId + ", roleName=" + roleName + ", powers=" + powers + "]";
	}
	public Integer getrId() {
		return rId;
	}
	public void setrId(Integer rId) {
		this.rId = rId;
	}
	
}
