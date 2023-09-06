package dev.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/products")
@RequestMapping("/api/v1/products")
public class ProductController {
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") long id) {
        return "Here is product id: " + id;
    }
    @GetMapping()
    public void getAllProducts() {

    }

    @PostMapping()
    public void createProduct(){

    }
    @DeleteMapping("{id}")
    public void deleteProduct(){

    }

    @PutMapping("{id}")
    public void updateProduct(){

    }
}
