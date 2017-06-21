/**
 * 文件名：User.java
 * 时间：2015年5月9日上午10:23:19
 * 作者：修维康
 */
package com.sdust.im.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * 类名：User 说明：用户对象
 */
public class User implements Serializable {
	public User() {

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String phone;
	private String uname;
	private String utype;
	private String upassword;
	private String ipaddress;
	private String ustatus;
	private String sex;
	private String age;
	private String picture;
	private String sign;
	private String utime;

	@Override
	public boolean equals(Object o) {
		User user = (User) o;
		if (this.id.equals(user.getId()))
			return true;
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getUstatus() {
		return ustatus;
	}

	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getUtime() {
		return utime;
	}

	public void setUtime(String utime) {
		this.utime = utime;
	}

}
