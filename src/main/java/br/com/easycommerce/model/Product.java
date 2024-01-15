package br.com.easycommerce.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Product {

    private String description;
    private double price;

}
