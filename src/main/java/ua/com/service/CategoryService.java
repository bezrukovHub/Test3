package ua.com.service;

import ua.com.entity.Category;

import java.util.List;

public interface CategoryService {

	void save(Category category);
	List<Category> findAll();
	Category findOne(int id);
	void delete(int id);
		
	
	
}
