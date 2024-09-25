package org.example.websys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    //New feat

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        return new Product(productId, productId + " new name");
    }
}