package com.drona.school.dao;

import java.util.List;

import com.drona.school.model.MenuItems;

public interface MenuDao {

	MenuItems findMenuById(int menuId);
	
	MenuItems findByName(String menuName);

	void saveMenus(MenuItems menuItems);

	void updateMenus(MenuItems menuItems);

	void deleteMenusByName(String menuItem);

	List<MenuItems> findAllMenus();
	
	List<MenuItems> findAllMenusByUserId(int menuGrpId);
	
	Long countMenuItems();
}
