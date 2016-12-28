package com.drona.school.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drona.school.model.MenuItems;
import com.drona.school.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@Autowired
	MessageSource messageSource;

	/**
	 * This method will list all Menus .
	 */
	@RequestMapping(value = { "/activeMenuList", "/home" }, method = RequestMethod.GET)
	public String listActiveUsers(ModelMap model) {
		List<MenuItems> menuItems = menuService.findAllMenusByUserId(1);
		model.addAttribute("activeMenuList", menuItems);
		model.addAttribute("activeUser", getPrincipal());
		return "activeMenuList";
	}
	
	/**
	 * This method will list all existing Menus.
	 */
	@RequestMapping(value = { "/menuList" }, method = RequestMethod.GET)
	public String listMenus(ModelMap model) {

		List<MenuItems> menuItems = menuService.findAllMenus();
		model.addAttribute("menuList", menuItems);
		model.addAttribute("activeUser", getPrincipal());
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
		model.addAttribute("activeUser", getPrincipal());
		return "newMenu";

	}
	
	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	@RequestMapping(value = { "/newMenu" }, method = RequestMethod.POST)
	public String saveMenu(@Valid MenuItems menuItems, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "newMenu";
		}

		/*
		 * Preferred way to achieve uniqueness of field [sso] should be
		 * implementing custom @Unique annotation and applying it on field [sso]
		 * of Model class [User].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you
		 * can fill custom errors outside the validation framework as well while
		 * still using internationalized messages.
		 * 
		 */
		if (!menuService.isMenuUnique(menuItems.getMenuId(), menuItems.getMenuName())) {
			FieldError menuNameError = new FieldError("menuItems", "menuName", messageSource.getMessage("non.unique.menuName",
					new String[] { menuItems.getMenuName() }, Locale.getDefault()));
			result.addError(menuNameError);
			return "newMenu";
		}

		menuService.saveMenus(menuItems);
		model.addAttribute("activeUser", getPrincipal());
		model.addAttribute("success", "Menu Item : " + menuItems.getMenuName() +  " registered successfully");
		return "registrationSuccess";
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
		model.addAttribute("activeUser", getPrincipal());
		return "MenuUpdateSuccess";
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}
}
