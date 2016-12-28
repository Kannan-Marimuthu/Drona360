package com.drona.school.service;

import java.util.List;

import com.drona.school.model.MenuGroup;

public interface MenuGroupService {

	MenuGroup findById(int id);

	MenuGroup findMenuGroupById(int menuGroupId);

	void saveMenuGroup(MenuGroup menuGroup);

	void updateMenuGroup(MenuGroup menuGroup);

	void deleteMenuGroupByName(String menuGroup);

	List<MenuGroup> findAllMenuGroup();

}
