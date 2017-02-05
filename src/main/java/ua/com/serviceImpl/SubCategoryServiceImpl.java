package ua.com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.dao.SubCategoryDao;
import ua.com.entity.SubCategory;
import ua.com.service.SubCategoryService;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	private SubCategoryDao subCategoryDao;

	public void save(SubCategory subCategory){
		subCategoryDao.save(subCategory);
	}

	public List<SubCategory> findAll() {
		return subCategoryDao.findAll();
	}

	public SubCategory findOne(int id) {
		return subCategoryDao.findOne(id);
	}

	public void delete(int id) {
		subCategoryDao.delete(id);
	}

}
