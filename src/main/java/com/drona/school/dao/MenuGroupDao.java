package com.drona.school.dao;

import java.util.List;

import com.drona.school.model.MenuGroup;

public interface MenuGroupDao {

	MenuGroup findMenuGroupById(int menuGroupId);

	void saveMenuGroup(MenuGroup menuGroup);

	void updateMenuGroup(MenuGroup menuGroup);

	void deleteMenuGroupByName(String menuGroup);

	List<MenuGroup> findAllMenuGroup();

	MenuGroup findById(int id);
}
