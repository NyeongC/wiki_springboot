package com.springboot.jpa.data.dto;

public class ProductResponseDto {

    private Long number;
    private String name;
    private int stock;
    private int price;

    public ProductResponseDto(Long number, String name, int stock, int price) {
        this.number = number;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public ProductResponseDto() {};

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
