package com.drona.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drona.school.dao.MenuDao;
import com.drona.school.model.MenuItems;

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
		// TODO Auto-generated method stub

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

}
