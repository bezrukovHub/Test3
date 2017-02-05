package ua.com.editor;

import ua.com.service.SubCategoryService;

import java.beans.PropertyEditorSupport;

/**
 * Created by OlehB9 on 04.02.2017.
 */
public class SubCategoryEditor  extends PropertyEditorSupport {

    private final SubCategoryService subCategoryService;


    public SubCategoryEditor(SubCategoryService subCategoryService) {

        this.subCategoryService = subCategoryService;
    }


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(subCategoryService.findOne(Integer.parseInt(text)));
    }
}
