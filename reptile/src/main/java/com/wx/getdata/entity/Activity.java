package com.wx.getdata.entity;

import java.io.Serializable;
import java.util.Date;

public class Activity extends BaseEntity implements Serializable{
	
	private Long id;
	
	private String title;
	
	private Integer ord;
	
	private String cls;
	
	private String logo;
	
	private Integer publish;
	
	private String attention;
	
	private String content;
	
	private String html;
	
	private Integer province_id;
	
	private Integer city_id;
	
	private Integer region_id;
	
	private String address;
	
	private Date begin_time;
	
	private Date end_time;
	
	private Date join_begin_time;
	
	private Date join_end_time;
	
	private Double lat;
	
	private Double lng;
	
	private String link_url;
	
	private Integer apply_limit_quantity;
	
	private Integer applyed_quantity;
	
	private Integer comment_quantity;
	
	private Integer fav_quantity;
	
	private Integer star;
	
	private Integer stat_count;
	
	private Integer is_realname;
	
	private Integer is_allow_post_pay;
	
	private Integer cal_complete;
	
	private String limit_area;
	
	private Double min_fee;
	
	private Double max_fee;
	
	private Double cashdown;
	
	private Integer isgroup;
	
	private Integer type;
	private Integer age;
	private Integer businessid;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public Integer getProvince_id() {
		return province_id;
	}

	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Date getJoin_begin_time() {
		return join_begin_time;
	}

	public void setJoin_begin_time(Date join_begin_time) {
		this.join_begin_time = join_begin_time;
	}

	public Date getJoin_end_time() {
		return join_end_time;
	}

	public void setJoin_end_time(Date join_end_time) {
		this.join_end_time = join_end_time;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public String getLink_url() {
		return link_url;
	}

	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}

	public Integer getApply_limit_quantity() {
		return apply_limit_quantity;
	}

	public void setApply_limit_quantity(Integer apply_limit_quantity) {
		this.apply_limit_quantity = apply_limit_quantity;
	}

	public Integer getApplyed_quantity() {
		return applyed_quantity;
	}

	public void setApplyed_quantity(Integer applyed_quantity) {
		this.applyed_quantity = applyed_quantity;
	}

	public Integer getComment_quantity() {
		return comment_quantity;
	}

	public void setComment_quantity(Integer comment_quantity) {
		this.comment_quantity = comment_quantity;
	}

	public Integer getFav_quantity() {
		return fav_quantity;
	}

	public void setFav_quantity(Integer fav_quantity) {
		this.fav_quantity = fav_quantity;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Integer getStat_count() {
		return stat_count;
	}

	public void setStat_count(Integer stat_count) {
		this.stat_count = stat_count;
	}

	public Integer getIs_realname() {
		return is_realname;
	}

	public void setIs_realname(Integer is_realname) {
		this.is_realname = is_realname;
	}

	public Integer getIs_allow_post_pay() {
		return is_allow_post_pay;
	}

	public void setIs_allow_post_pay(Integer is_allow_post_pay) {
		this.is_allow_post_pay = is_allow_post_pay;
	}

	public Integer getCal_complete() {
		return cal_complete;
	}

	public void setCal_complete(Integer cal_complete) {
		this.cal_complete = cal_complete;
	}

	public String getLimit_area() {
		return limit_area;
	}

	public void setLimit_area(String limit_area) {
		this.limit_area = limit_area;
	}

	public Double getMin_fee() {
		return min_fee;
	}

	public void setMin_fee(Double min_fee) {
		this.min_fee = min_fee;
	}

	public Double getMax_fee() {
		return max_fee;
	}

	public void setMax_fee(Double max_fee) {
		this.max_fee = max_fee;
	}

	public Double getCashdown() {
		return cashdown;
	}

	public void setCashdown(Double cashdown) {
		this.cashdown = cashdown;
	}

	public Integer getIsgroup() {
		return isgroup;
	}

	public void setIsgroup(Integer isgroup) {
		this.isgroup = isgroup;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getBusinessid() {
		return businessid;
	}

	public void setBusinessid(Integer businessid) {
		this.businessid = businessid;
	}

	@Override
	public String toString() {
		return "Activity{" +
				"id=" + id +
				", title='" + title + '\'' +
				", ord=" + ord +
				", cls='" + cls + '\'' +
				", logo='" + logo + '\'' +
				", publish=" + publish +
				", attention='" + attention + '\'' +
				", content='" + content + '\'' +
				", html='" + html + '\'' +
				", province_id=" + province_id +
				", city_id=" + city_id +
				", region_id=" + region_id +
				", address='" + address + '\'' +
				", begin_time=" + begin_time +
				", end_time=" + end_time +
				", join_begin_time=" + join_begin_time +
				", join_end_time=" + join_end_time +
				", lat=" + lat +
				", lng=" + lng +
				", link_url='" + link_url + '\'' +
				", apply_limit_quantity=" + apply_limit_quantity +
				", applyed_quantity=" + applyed_quantity +
				", comment_quantity=" + comment_quantity +
				", fav_quantity=" + fav_quantity +
				", star=" + star +
				", stat_count=" + stat_count +
				", is_realname=" + is_realname +
				", is_allow_post_pay=" + is_allow_post_pay +
				", cal_complete=" + cal_complete +
				", limit_area='" + limit_area + '\'' +
				", min_fee=" + min_fee +
				", max_fee=" + max_fee +
				", cashdown=" + cashdown +
				", isgroup=" + isgroup +
				", type=" + type +
				", age=" + age +
				", businessid=" + businessid +
				'}';
	}
}
