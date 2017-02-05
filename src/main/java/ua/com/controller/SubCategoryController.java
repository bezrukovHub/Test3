package ua.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.editor.CategoryEditor;
import ua.com.entity.Category;
import ua.com.entity.SubCategory;
import ua.com.service.CategoryService;
import ua.com.service.SubCategoryService;

/**
 * Created by OlehB9 on 04.02.2017.
 */
@Controller
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private CategoryService categoryService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
    }

    @RequestMapping(value = "/newSubCategory", method = RequestMethod.GET)
    public String newSubCategory(Model model) {

        model.addAttribute("subCategory", new SubCategory());
        model.addAttribute("subCategories", subCategoryService.findAll());
        model.addAttribute("categories", categoryService.findAll());
        return "admin/newSubCategory";
    }

    @RequestMapping(value = "/saveSubCategory", method = RequestMethod.POST)
    public String saveSubCategory(@ModelAttribute SubCategory subCategory) {

        subCategoryService.save(subCategory);

        return "redirect:/newSubCategory";
    }

    @RequestMapping(value = "/deleteSubCategory/{id}", method = RequestMethod.GET)
    public String deleteSubCategory(@PathVariable int id) {

        subCategoryService.delete(id);

        return "redirect:/newSubCategory";
    }

}
