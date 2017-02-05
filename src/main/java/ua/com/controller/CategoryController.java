package ua.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.entity.Category;
import ua.com.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;


	@RequestMapping(value = "/newCategory", method = RequestMethod.GET)
	public String newCategory(Model model) {
		model.addAttribute("category", new Category());
		model.addAttribute("categories", categoryService.findAll());
		return "admin/newCategory";
	}
	
	@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute Category category) {
		
		categoryService.save(category);

		return "redirect:/newCategory";
	}

	@RequestMapping(value = "/deleteCategory/{id}", method = RequestMethod.GET)
	public String newCategory(@PathVariable String id) {
		categoryService.delete(Integer.parseInt(id));
		return "redirect:/newCategory";
	}

}
