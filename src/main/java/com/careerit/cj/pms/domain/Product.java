package com.careerit.cj.pms.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private double discount;
    private double price;
}
