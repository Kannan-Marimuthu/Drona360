package com.drona.school.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.drona.school.model.MenuGroup;
import com.drona.school.model.MenuItems;
import com.drona.school.model.User;

@Repository("menuDao")
public class MenuDaoImpl extends AbstractDao<Integer, User> implements MenuDao {

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

	@SuppressWarnings("unchecked")
	public List<MenuGroup> findAllMenuGroup() {
		List<MenuGroup> menuGroup = getEntityManager()
				.createQuery("SELECT u FROM MenuGroup u ORDER BY u.MenuGrp_Name ASC").getResultList();
		return menuGroup;
	}

	@SuppressWarnings("unchecked")
	public List<MenuGroup> findAllMenuGroupById(Integer menuGrpId) {
		List<MenuGroup> menuGroup = getEntityManager()
				.createQuery("SELECT u FROM MenuGroup u WHERE u.menuGrpId LIKE :menuGrpId ORDER BY u.MenuGrp_Name ASC")
				.setParameter("menuGrpId", menuGrpId).getResultList();
		return menuGroup;
	}

	public MenuItems findMenuById(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveMenus(MenuItems menuItems) {
		// TODO Auto-generated method stub

	}

	public void updateMenus(MenuItems menuItems) {
		// TODO Auto-generated method stub

	}

	public void deleteMenusByName(String menuItem) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public List<MenuItems> findAllMenus() {
		List<MenuItems> menuItems = getEntityManager().createQuery("SELECT u FROM MenuItems u ORDER BY u.menuName ASC")
				.getResultList();
		return menuItems;
	}

	// An alternative to Hibernate.initialize()
	protected void initializeCollection(Collection<?> collection) {
		if (collection == null) {
			return;
		}
		collection.iterator().hasNext();
	}

	@SuppressWarnings("unchecked")
	public List<MenuItems> findAllMenusByUserId(int menuGrpId) {
		List<MenuItems> menuItems = getEntityManager().createQuery("SELECT u FROM MenuItems u ,MenuGroup v WHERE  u.menuGroup.menuGrpId=v.menuGrpId "
				+ "and v.menuGrpId like:menuGrpId ORDER BY u.menuName ASC")
				.setParameter("menuGrpId", menuGrpId).getResultList();
		return menuItems;
	}

}
