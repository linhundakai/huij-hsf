package org.huij.hsf.api.domain;

public class Member {

	private long id;
	private String name;
	private String addr;
	private int level;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", addr=" + addr + ", level=" + level + "]";
	}
	
	
	
}
