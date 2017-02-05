package ua.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ua.com.editor.SubCategoryEditor;
import ua.com.entity.Commodity;
import ua.com.entity.SubCategory;
import ua.com.service.CommodityService;
import ua.com.service.SubCategoryService;

/**
 * Created by OlehB9 on 04.02.2017.
 */

@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private SubCategoryService subCategoryService;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(SubCategory.class, new SubCategoryEditor(subCategoryService));
    }

    @RequestMapping(value = "/newCommodity", method = RequestMethod.GET)
    public String newCommodity(Model model) {

        model.addAttribute("commodity", new Commodity());
        model.addAttribute("commodities", commodityService.findAll());
        model.addAttribute("subCategories", subCategoryService.findAll());
        return "admin/newCommodity";
    }

    @RequestMapping(value = "/saveCommodity", method = RequestMethod.POST)
    public String saveCommodity(@ModelAttribute Commodity commodity) {

        commodityService.save(commodity);

        return "redirect:/newCommodity";
    }

    @RequestMapping(value = "/deleteCommodity/{id}", method = RequestMethod.GET)
    public String deleteCommodity(@PathVariable int id) {

        commodityService.delete(id);

        return "redirect:/newCommodity";
    }

}
