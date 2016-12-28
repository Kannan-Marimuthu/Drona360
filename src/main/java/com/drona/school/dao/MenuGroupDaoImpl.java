package com.drona.school.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drona.school.model.MenuGroup;

@Repository("menuGroupDao")
public class MenuGroupDaoImpl extends AbstractDao<Integer, MenuGroup> implements MenuGroupDao {

	public void saveMenuGroup(MenuGroup menuGroup) {
		// TODO Auto-generated method stub

	}

	public void updateMenuGroup(MenuGroup menuGroup) {
		// TODO Auto-generated method stub

	}

	public void deleteMenuGroupByName(String menuGroup) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public List<MenuGroup> findAllMenuGroup() {
		List<MenuGroup> menuGroup = getEntityManager()
				.createQuery("SELECT u FROM MenuGroup u ORDER BY u.menuGrpName ASC").getResultList();
		return menuGroup;
	}

	public MenuGroup findById(int id) {
		return getByKey(id);
	}

	public MenuGroup findMenuGroupById(int menuGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

}
