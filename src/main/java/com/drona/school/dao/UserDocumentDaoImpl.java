package com.drona.school.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drona.school.model.UserDocument;

@Repository("userDocumentDao")
public class UserDocumentDaoImpl extends AbstractDao<Integer, UserDocument> implements UserDocumentDao {

	@SuppressWarnings("unchecked")
	public List<UserDocument> findAll() {
		List<UserDocument> userDocuments = getEntityManager()
				.createQuery("SELECT u FROM UserDocument u ORDER BY u.id ASC").getResultList();
		return userDocuments;
	}

	public void save(UserDocument document) {
		persist(document);
	}

	public UserDocument findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<UserDocument> findAllByUserId(int userId) {
		List<UserDocument> userDocuments = getEntityManager()
				.createQuery("SELECT u FROM UserDocument u ,User v WHERE u.user.id = v.id and v.id LIKE :userId").setParameter("userId", userId)
				.getResultList();
		return userDocuments;
	}

	public void deleteById(int id) {
		UserDocument document = getByKey(id);
		delete(document);
	}

}
