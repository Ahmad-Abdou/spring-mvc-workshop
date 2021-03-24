package com.lexicon.springmvcworkshop.dto;

import java.util.Objects;

public class ProductDTO {
    private int id;
    private String name;
    private int price;
    private ProductDTODetails productDTODetails;

    public ProductDTO() {
    }

    public ProductDTO(String name, int price, ProductDTODetails productDTODetails) {
        this.name = name;
        this.price = price;
        this.productDTODetails = productDTODetails;
    }

    public ProductDTO(int id, String name, int price, ProductDTODetails productDTODetails) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDTODetails = productDTODetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductDTODetails getProductDTODetails() {
        return productDTODetails;
    }

    public void setProductDTODetails(ProductDTODetails productDTODetails) {
        this.productDTODetails = productDTODetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return id == that.id && price == that.price && Objects.equals(name, that.name) && Objects.equals(productDTODetails, that.productDTODetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, productDTODetails);
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productDTODetails=" + productDTODetails +
                '}';
    }
}
