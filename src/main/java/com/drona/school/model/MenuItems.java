package com.drona.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Kannan
 *
 */
@Entity
@Table(name = "MENUITEMS")
public class MenuItems {

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
	@ManyToOne(optional = false)
	@JoinColumn(name = "MenuGrp_ID")
	private MenuGroup menuGroup;

	public MenuGroup getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(MenuGroup menuGroup) {
		this.menuGroup = menuGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "MenuItems [menuId=" + menuId + ", menuName=" + menuName + ", menuDisplayTxt=" + menuDisplayTxt
				+ ", menuFileName=" + menuFileName + ", menuURL=" + menuURL + ", useYorN=" + useYorN + "]";
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

}
