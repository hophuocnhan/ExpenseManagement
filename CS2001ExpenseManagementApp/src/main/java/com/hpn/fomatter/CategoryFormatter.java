/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hpn.fomatter;

import com.hpn.pojo.Category;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author defaultuser0
 */
public class CategoryFormatter implements Formatter<Category> {

    @Override
    public String print(Category category, Locale locale) {
        return String.valueOf(category.getId());
    }

    @Override
    public Category parse(String categoryId, Locale locale) throws ParseException {
        int id = Integer.parseInt(categoryId);
        return new Category(id);
    }
}
