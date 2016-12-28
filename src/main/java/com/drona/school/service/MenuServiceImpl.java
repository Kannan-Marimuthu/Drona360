package com.drona.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drona.school.dao.MenuDao;
import com.drona.school.model.MenuItems;
import com.drona.school.model.User;

@Service("menuService")
@Transactional
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao dao;

	public MenuItems findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveMenus(MenuItems menuItems) {
		dao.saveMenus(menuItems);
	}

	public void updateMenus(MenuItems menuItems) {
		// TODO Auto-generated method stub

	}

	public void deleteMenusByName(String menu) {
		// TODO Auto-generated method stub

	}

	public List<MenuItems> findAllMenus() {
		return dao.findAllMenus();
	}

	public List<MenuItems> findAllMenusByUserId(Integer menuGrpId) {
		return dao.findAllMenusByUserId(menuGrpId);
	}

	public boolean isMenuUnique(Integer menuId, String menuName) {
		MenuItems menuItems = findByName(menuName);
		return (menuItems == null || ((menuId != null) && (menuItems.getMenuId() == menuId)));
	}

	public MenuItems findByName(String menuName) {
		MenuItems menuItems = dao.findByName(menuName);
		return menuItems;
	}

}
