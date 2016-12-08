package com.drona.school.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drona.school.model.MenuItems;
import com.drona.school.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	MenuService menuService;

	/**
	 * This method will list all Menus .
	 */
	@RequestMapping(value = { "/activeMenuList", "/home" }, method = RequestMethod.GET)
	public String listActiveUsers(ModelMap model) {
		List<MenuItems> menuItems = menuService.findAllMenusByUserId(1);
		model.addAttribute("activeMenuList", menuItems);
		return "activeMenuList";
	}
	
	/**
	 * This method will list all existing Menus.
	 */
	@RequestMapping(value = { "/menuList" }, method = RequestMethod.GET)
	public String listMenus(ModelMap model) {

		List<MenuItems> menuItems = menuService.findAllMenus();
		model.addAttribute("menuList", menuItems);
		return "menuList";
	}
	

	/**
	 * This method will provide the medium to add a new Menu.
	 */
	@RequestMapping(value = { "/newMenu" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		MenuItems menuItems = new MenuItems();
		model.addAttribute("menuItems", menuItems);
		model.addAttribute("edit", false);
		return "registration";

	}

	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/edit-menu-{menuGrpId}" }, method = RequestMethod.POST)
	public String updateUser(@Valid MenuItems menuItems, BindingResult result, ModelMap model,
			@PathVariable Integer menuItemId) {
		if (result.hasErrors()) {
			return "MenuItemErrors";
		}
		menuService.updateMenus(menuItems);
		model.addAttribute("success", menuItems.getMenuName() + " updated successfully");
		return "MenuUpdateSuccess";
	}
}
