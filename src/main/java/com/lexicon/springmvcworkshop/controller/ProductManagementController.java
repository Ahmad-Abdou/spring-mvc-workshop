package com.lexicon.springmvcworkshop.controller;

import com.lexicon.springmvcworkshop.dto.ProductDTO;
import com.lexicon.springmvcworkshop.dto.ProductDTODetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementController {

    private List<ProductDTO> productDtoList;

    @PostConstruct
    public void Product(){
        if(productDtoList == null){
            productDtoList = new ArrayList<>();
            ProductDTODetails productDTODetails = new ProductDTODetails(1,"test","test");
            productDtoList.add(new ProductDTO(1,"testName",23,productDTODetails));
        }
    }



    @GetMapping("/")
    public String getAllProducts(Model model){
        model.addAttribute("productDtoList",productDtoList);
        return "productManagement";
    }
    @GetMapping("/find/{id}")
    public String findByID(@PathVariable("id") Integer id, Model model){
       Optional<ProductDTO>productDTOOptional= productDtoList.stream().filter(productDTO -> productDTO.getId()==id).findFirst();
       if(productDTOOptional.isPresent()){
           model.addAttribute("productDetails",productDTOOptional.get());
       }
       else
           model.addAttribute("productDetails",new ProductDTO());

        return "details";
    }

}
