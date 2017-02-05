package ua.com.service;

import ua.com.entity.SubCategory;

import java.util.List;

public interface SubCategoryService {

	void save(SubCategory subCategory);
	List<SubCategory> findAll();
	SubCategory findOne(int id);
	void delete(int id);

}
