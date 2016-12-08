package com.drona.school.dao;

import java.util.List;

import com.drona.school.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);
}
