package com.lexicon.springmvcworkshop.controller;

import com.lexicon.springmvcworkshop.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("/admin/product")
public class ProductManagementController {

    private List<ProductDTO> productDtoList;



    @GetMapping("/")
    public String getAllProducts(Model model){
        model.addAttribute("productDtoList",productDtoList);
        return "productManagement";
    }

}
