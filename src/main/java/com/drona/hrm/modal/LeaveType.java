package com.drona.hrm.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "LEAVE_TYPE")
public class LeaveType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LeaveType_Id", unique = true, nullable = false)
	private Integer leaveTypeId;

	@NotEmpty
	@Column(name = "LeaveType", nullable = false)
	private String leaveType;

	@NotEmpty
	@Column(name = "noofLeaves", nullable = false)
	private Integer noofLeaves;

	public Integer getLeaveTypeId() {
		return leaveTypeId;
	}

	public void setLeaveTypeId(Integer leaveTypeId) {
		this.leaveTypeId = leaveTypeId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Integer getNoofLeaves() {
		return noofLeaves;
	}

	public void setNoofLeaves(Integer noofLeaves) {
		this.noofLeaves = noofLeaves;
	}

}
