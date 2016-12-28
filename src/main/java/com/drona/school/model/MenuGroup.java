/**
 * 
 */
package com.drona.school.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Kannan
 *
 */
@Entity
@Table(name = "MENUGRP")
public class MenuGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MenuGrp_ID")
	private Integer menuGrpId;

	@NotEmpty
	@Column(name = "MenuGrp_Name", nullable = false)
	private String menuGrpName;

	@NotEmpty
	@Column(name = "MenuGrp_DisplayTxt", nullable = false)
	private String menuGrpDisplayTxt;

	@NotEmpty
	@Column(name = "Menu_ChildID", nullable = false)
	private String menuChildID;

	@NotEmpty
	@Column(name = "Who", nullable = false)
	private String who;

	public Integer getMenuGrpId() {
		return menuGrpId;
	}

	public void setMenuGrpId(Integer menuGrpId) {
		this.menuGrpId = menuGrpId;
	}

	public String getMenuGrpName() {
		return menuGrpName;
	}

	public void setMenuGrpName(String menuGrpName) {
		this.menuGrpName = menuGrpName;
	}

	public String getMenuGrpDisplayTxt() {
		return menuGrpDisplayTxt;
	}

	public void setMenuGrpDisplayTxt(String menuGrpDisplayTxt) {
		this.menuGrpDisplayTxt = menuGrpDisplayTxt;
	}

	public String getMenuChildID() {
		return menuChildID;
	}

	public void setMenuChildID(String menuChildID) {
		this.menuChildID = menuChildID;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuChildID == null) ? 0 : menuChildID.hashCode());
		result = prime * result + ((menuGrpId == null) ? 0 : menuGrpId.hashCode());
		result = prime * result + ((menuGrpName == null) ? 0 : menuGrpName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuGroup other = (MenuGroup) obj;
		if (menuChildID == null) {
			if (other.menuChildID != null)
				return false;
		} else if (!menuChildID.equals(other.menuChildID))
			return false;
		if (menuGrpId == null) {
			if (other.menuGrpId != null)
				return false;
		} else if (!menuGrpId.equals(other.menuGrpId))
			return false;
		if (menuGrpName == null) {
			if (other.menuGrpName != null)
				return false;
		} else if (!menuGrpName.equals(other.menuGrpName))
			return false;
		return true;
	}
}
