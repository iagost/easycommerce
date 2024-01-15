package br.com.easycommerce.controller;

import br.com.easycommerce.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            products.add(Product.builder()
                                .description("Product " + i)
                                .price(100 * i)
                                .build());
        }
        model.addAttribute("products", products);
        model.addAttribute("message", "EasyCommerce");
        return "home";
    }

}
