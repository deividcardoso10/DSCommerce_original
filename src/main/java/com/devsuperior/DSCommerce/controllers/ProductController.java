package com.devsuperior.DSCommerce.controllers;

import com.devsuperior.DSCommerce.dto.ProductDTO;
import com.devsuperior.DSCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value ="/{id}")
    public ProductDTO findById(@PathVariable Long id){
        ProductDTO dto = service.findById(id);
        return dto;
    }

    @PostMapping
    public Page<ProductDTO> findAll(Pageable pageable){
        return service.findAll(pageable);

    }
    @GetMapping
    public ProductDTO insert(@RequestBody ProductDTO dto){
        return service.insert(dto);

    }

}
