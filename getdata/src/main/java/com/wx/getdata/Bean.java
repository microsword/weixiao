package com.wx.getdata;

public class Bean {
	private Integer id;
	private String type;
	private String name;
	private String tel;
	private String addr;
	private String pname;
	private String cname;
	private String aname;
	private String pic_url;
	private String l;
	private String w;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String amame) {
		this.aname = amame;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Bean [id=" + id + ", type=" + type + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", pname="
				+ pname + ", cname=" + cname + ", aname=" + aname + ", pic_url=" + pic_url + ", l=" + l + ", w=" + w
				+ "]";
	}
	
}
