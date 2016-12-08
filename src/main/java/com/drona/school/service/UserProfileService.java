package com.drona.school.service;

import java.util.List;

import com.drona.school.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);
}
