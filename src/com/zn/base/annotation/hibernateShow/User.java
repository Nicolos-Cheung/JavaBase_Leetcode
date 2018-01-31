package com.zn.base.annotation.hibernateShow;

@Table("user")
public class User {
	
	@Column("id")
	private int id;
	@Column("user_name")
	private String username;
	@Column("email")
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
