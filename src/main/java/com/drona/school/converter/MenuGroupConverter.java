package com.drona.school.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.drona.school.model.MenuGroup;
import com.drona.school.service.MenuGroupService;

@Component
public class MenuGroupConverter implements Converter<Object, MenuGroup> {

	@Autowired
	MenuGroupService menuGroupService;

	/*
	 * Gets MenuGroup by Id
	 * 
	 * @see
	 * org.springframework.core.convert.converter.Converter#convert(java.lang.
	 * Object)
	 */

	public MenuGroup convert(Object element) {
		Integer id = Integer.parseInt((String) element);
		MenuGroup menuGroup = menuGroupService.findById(id);
		System.out.println("Menu Group : " + id);
		System.out.println("Menu Group : " + menuGroup);
		return menuGroup;
	}

}