package com.bkda.simplespa.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.bkda.simplespa.FXApplication;
import com.bkda.simplespa.models.Category;
import java.util.List;

public class CategoryDAO {
	
	private EntityManager theManager;
	
	public CategoryDAO() {
		theManager = FXApplication.getSessionFactory().createEntityManager();
	}
	
	public Category addCategory(Category cat) {
		theManager.getTransaction().begin();
		theManager.persist(cat);
		theManager.getTransaction().commit();
		return cat;
	}
	
	public List<Category> getAllCategories() {
		TypedQuery<Category> query = theManager.createQuery("from Category", Category.class);
		return query.getResultList();
	}
	
	@Override
	public void finalize() {
		theManager.close();
	}
}
