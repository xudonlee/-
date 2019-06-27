package com.itzl.pojo;

public class Bank {
	private Integer id;
	private Integer money;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", money=" + money + ", name=" + name + "]";
	}
	

}
