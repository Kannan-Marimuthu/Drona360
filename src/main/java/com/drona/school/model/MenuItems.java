package com.drona.school.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Kannan
 *
 */
@Entity
@Table(name = "MENU")
public class MenuItems implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Menu_ID", unique = true, nullable = false)
	private Integer menuId;

	@NotEmpty
	@Column(name = "MenuName", nullable = false)
	private String menuName;

	@NotEmpty
	@Column(name = "MenuDisplayTxt", nullable = false)
	private String menuDisplayTxt;

	@NotEmpty
	@Column(name = "MenuFileName", nullable = false)
	private String menuFileName;

	@NotEmpty
	@Column(name = "MenuURL", nullable = false)
	private String menuURL;

	@NotEmpty
	@Column(name = "USE_YN", nullable = false)
	private String useYorN;

	@NotEmpty
	@Column(name = "Who", nullable = false)
	private String who;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "MENU_ASGN", joinColumns = { @JoinColumn(name = "Menu_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "MenuGrp_ID") })
	private Set<MenuGroup> userMenuGroups = new HashSet<MenuGroup>();

	public Set<MenuGroup> getUserMenuGroups() {
		return userMenuGroups;
	}

	public void setUserMenuGroups(Set<MenuGroup> userMenuGroups) {
		this.userMenuGroups = userMenuGroups;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDisplayTxt() {
		return menuDisplayTxt;
	}

	public void setMenuDisplayTxt(String menuDisplayTxt) {
		this.menuDisplayTxt = menuDisplayTxt;
	}

	public String getMenuFileName() {
		return menuFileName;
	}

	public void setMenuFileName(String menuFileName) {
		this.menuFileName = menuFileName;
	}

	public String getMenuURL() {
		return menuURL;
	}

	public void setMenuURL(String menuURL) {
		this.menuURL = menuURL;
	}

	public String getUseYorN() {
		return useYorN;
	}

	public void setUseYorN(String useYorN) {
		this.useYorN = useYorN;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	@Override
	public String toString() {
		return "MenuItems [menuId=" + menuId + ", menuName=" + menuName + ", menuDisplayTxt=" + menuDisplayTxt
				+ ", menuFileName=" + menuFileName + ", menuURL=" + menuURL + ", useYorN=" + useYorN + ", who=" + who
				+ ", userMenuGroups=" + userMenuGroups + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
		result = prime * result + ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + ((menuURL == null) ? 0 : menuURL.hashCode());
		result = prime * result + ((useYorN == null) ? 0 : useYorN.hashCode());
		result = prime * result + ((who == null) ? 0 : who.hashCode());
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
		MenuItems other = (MenuItems) obj;
		if (menuId == null) {
			if (other.menuId != null)
				return false;
		} else if (!menuId.equals(other.menuId))
			return false;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (menuURL == null) {
			if (other.menuURL != null)
				return false;
		} else if (!menuURL.equals(other.menuURL))
			return false;
		if (useYorN == null) {
			if (other.useYorN != null)
				return false;
		} else if (!useYorN.equals(other.useYorN))
			return false;
		if (who == null) {
			if (other.who != null)
				return false;
		} else if (!who.equals(other.who))
			return false;
		return true;
	}

}
