package com.drona.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.drona.school.dao.MenuGroupDao;
import com.drona.school.model.MenuGroup;

@Service("menuGroupService")
@Transactional
public class MenuGroupServiceImpl implements MenuGroupService {

	@Autowired
	private MenuGroupDao dao;

	public MenuGroup findMenuGroupById(int menuGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveMenuGroup(MenuGroup menuGroup) {
		// TODO Auto-generated method stub

	}

	public void updateMenuGroup(MenuGroup menuGroup) {
		// TODO Auto-generated method stub

	}

	public void deleteMenuGroupByName(String menuGroup) {
		// TODO Auto-generated method stub

	}

	public List<MenuGroup> findAllMenuGroup() {
		return dao.findAllMenuGroup();
	}

	public MenuGroup findById(int id) {
		return dao.findById(id);
	}

}
