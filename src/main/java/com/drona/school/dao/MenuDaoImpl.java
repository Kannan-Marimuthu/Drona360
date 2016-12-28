package com.drona.school.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.drona.school.model.MenuItems;

@Repository("menuDao")
public class MenuDaoImpl extends AbstractDao<Integer, MenuItems> implements MenuDao {

	public MenuItems findMenuById(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveMenus(MenuItems menuItems) {
		persist(menuItems);
	}

	public void updateMenus(MenuItems menuItems) {
		// TODO Auto-generated method stub

	}

	public void deleteMenusByName(String menuName) {
		MenuItems menuItems = (MenuItems) getEntityManager()
				.createQuery("SELECT u FROM MenuItems u WHERE u.menuName LIKE :menuName")
				.setParameter("menuName", menuName).getSingleResult();
		delete(menuItems);

	}

	@SuppressWarnings("unchecked")
	public List<MenuItems> findAllMenus() {
		List<MenuItems> menuItems = getEntityManager().createQuery("SELECT u FROM MenuItems u ORDER BY u.menuName ASC")
				.getResultList();
		return menuItems;
	}

	@SuppressWarnings("unchecked")
	public List<MenuItems> findAllMenusByUserId(int menuGrpId) {
		/*
		 * List<MenuItems> menuItems = getEntityManager() .createQuery(
		 * "SELECT u FROM MenuItems u ,MenuGroup v WHERE  u.menuGroup.menuGrpId=v.menuGrpId "
		 * + "and v.menuGrpId like:menuGrpId ORDER BY u.menuName ASC")
		 * .setParameter("menuGrpId", menuGrpId).getResultList();
		 */
		List<MenuItems> menuItems = getEntityManager().createQuery("SELECT u FROM MenuItems u ORDER BY u.menuName ASC")
				.getResultList();

		return menuItems;
	}

	public Long countMenuItems() {
		return (Long) this.entityManager.createQuery("SELECT count(u) FROM MenuItems u ORDER BY u.menuName ASC")
				.getSingleResult();
	}

	public MenuItems findByName(String menuName) {
		System.out.println("menuName : " + menuName);
		try {
			MenuItems menuItems = (MenuItems) getEntityManager()
					.createQuery("SELECT u FROM MenuItems u WHERE u.menuName LIKE :menuName")
					.setParameter("menuName", menuName).getSingleResult();

			if (menuItems != null) {
				initializeCollection(menuItems.getUserMenuGroups());
			}
			return menuItems;
		} catch (NoResultException ex) {
			return null;
		}
	}

	// An alternative to Hibernate.initialize()
	protected void initializeCollection(Collection<?> collection) {
		if (collection == null) {
			return;
		}
		collection.iterator().hasNext();
	}

}
