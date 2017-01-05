package com.wx.getdata.entity;

import java.util.Date;

public class ActivityTicket extends BaseEntity {

	private Long id;
	
	private String title;
	private String type;
	private Long sid;
	private String cls;
	private Integer ord;
	private Integer ticket_quantity;
	private Double original_fee;
	private Double fee;
	private Double discount;
	private Date end_time;
	private Date begin_time;
	private Date cancel_end_time;
	private Integer is_anytime;
	private Integer is_group;
	private String readme;
	private Date group_end_time;
	private Integer ticket_sells;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public Integer getOrd() {
		return ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public Integer getTicket_quantity() {
		return ticket_quantity;
	}

	public void setTicket_quantity(Integer ticket_quantity) {
		this.ticket_quantity = ticket_quantity;
	}

	public Double getOriginal_fee() {
		return original_fee;
	}

	public void setOriginal_fee(Double original_fee) {
		this.original_fee = original_fee;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public Date getCancel_end_time() {
		return cancel_end_time;
	}

	public void setCancel_end_time(Date cancel_end_time) {
		this.cancel_end_time = cancel_end_time;
	}

	public Integer getIs_anytime() {
		return is_anytime;
	}

	public void setIs_anytime(Integer is_anytime) {
		this.is_anytime = is_anytime;
	}

	public Integer getIs_group() {
		return is_group;
	}

	public void setIs_group(Integer is_group) {
		this.is_group = is_group;
	}

	public String getReadme() {
		return readme;
	}

	public void setReadme(String readme) {
		this.readme = readme;
	}

	public Date getGroup_end_time() {
		return group_end_time;
	}

	public void setGroup_end_time(Date group_end_time) {
		this.group_end_time = group_end_time;
	}

	public Integer getTicket_sells() {
		return ticket_sells;
	}

	public void setTicket_sells(Integer ticket_sells) {
		this.ticket_sells = ticket_sells;
	}
}
