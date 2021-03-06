package com.drona.school.service;

import java.util.List;

import com.drona.school.model.MenuItems;

public interface MenuService {

	MenuItems findById(int id);
	
	MenuItems findByName(String menuName);

	void saveMenus(MenuItems menuItems);

	void updateMenus(MenuItems menuItems);

	void deleteMenusByName(String menu);

	List<MenuItems> findAllMenus();

	List<MenuItems> findAllMenusByUserId(Integer menuGrpId);

	boolean isMenuUnique(Integer menuId, String menuName);
}
