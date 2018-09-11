package com.leo.springcloud.entity;

public class User{
	
	private int id; // 用户id
	private String name; // 用户名
	private String db_source; // 数据库 信息来源
	
	public User() {
		super();
	}

	public User(int id, String name, String db_source) {
		super();
		this.id = id;
		this.name = name;
		this.db_source = db_source;
	}

	public User(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", db_source=" + db_source + "]";
	}
	
	
	
}
