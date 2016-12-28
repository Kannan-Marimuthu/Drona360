package com.drona.hrm.modal;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "LEAVE_MGMT")
public class Awards implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Award_Id", unique = true, nullable = false)
	private Integer awardId;

	@NotEmpty
	@ManyToOne(optional = false)
	@JoinColumn(name = "Emp_id")
	private Integer empId;

	@NotEmpty
	@Column(name = "AwardName", nullable = false)
	private String awardName;

	@NotEmpty
	@Column(name = "GiftItem", nullable = false)
	private String giftItem;

	@NotEmpty
	@Column(name = "Month", nullable = false)
	private Date Month;

	@NotEmpty
	@Column(name = "Year", nullable = false)
	private Date Year;

	@NotEmpty
	@Column(name = "CashPrice", nullable = false)
	private BigInteger cashPrice;

	public Integer getAwardId() {
		return awardId;
	}

	public void setAwardId(Integer awardId) {
		this.awardId = awardId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getGiftItem() {
		return giftItem;
	}

	public void setGiftItem(String giftItem) {
		this.giftItem = giftItem;
	}

	public Date getMonth() {
		return Month;
	}

	public void setMonth(Date month) {
		Month = month;
	}

	public Date getYear() {
		return Year;
	}

	public void setYear(Date year) {
		Year = year;
	}

	public BigInteger getCashPrice() {
		return cashPrice;
	}

	public void setCashPrice(BigInteger cashPrice) {
		this.cashPrice = cashPrice;
	}

}
