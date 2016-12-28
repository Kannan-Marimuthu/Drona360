package com.drona.hrm.modal;

import java.io.Serializable;
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
public class Leave implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Leave_id", unique = true, nullable = false)
	private Integer leaveId;

	@NotEmpty
	@ManyToOne(optional = false)
	@JoinColumn(name = "Emp_id")
	private Integer empId;

	@NotEmpty
	@Column(name = "LeaveType", nullable = false)
	private String leaveType;

	@NotEmpty
	@Column(name = "LeaveDate", nullable = false)
	private Date leaveDate;

	@NotEmpty
	@Column(name = "Reason", nullable = false)
	private String reason;

	@NotEmpty
	@Column(name = "AppliedOn", nullable = false)
	private Date appliedOn;

	@NotEmpty
	@Column(name = "Status", nullable = false)
	private String status;

	public Integer getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getAppliedOn() {
		return appliedOn;
	}

	public void setAppliedOn(Date appliedOn) {
		this.appliedOn = appliedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
