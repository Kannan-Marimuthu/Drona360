package com.drona.school.dao;

import java.util.List;

import com.drona.school.model.MenuGroup;
import com.drona.school.model.MenuItems;

public interface MenuDao {

	MenuGroup findMenuGroupById(int menuGroupId);

	void saveMenuGroup(MenuGroup menuGroup);

	void updateMenuGroup(MenuGroup menuGroup);

	void deleteMenuGroupByName(String menuGroup);

	List<MenuGroup> findAllMenuGroup();

	MenuItems findMenuById(int menuId);

	void saveMenus(MenuItems menuItems);

	void updateMenus(MenuItems menuItems);

	void deleteMenusByName(String menuItem);

	List<MenuItems> findAllMenus();
	
	List<MenuItems> findAllMenusByUserId(int menuGrpId);
}
