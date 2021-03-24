package com.lexicon.springmvcworkshop.dto;

import java.util.Arrays;
import java.util.Objects;

public class ProductDTODetails {
    private int id;
    private String name;
    private String description;
    private byte[] image;
    private String imageString;


    public ProductDTODetails() {
    }

    public ProductDTODetails(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProductDTODetails(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProductDTODetails(int id, String name, String description, byte[] image, String imageString) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.imageString = imageString;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageString() {
        return imageString;
    }

    public void setImageString(String imageString) {
        this.imageString = imageString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTODetails that = (ProductDTODetails) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Arrays.equals(image, that.image) && Objects.equals(imageString, that.imageString);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, description, imageString);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }

    @Override
    public String toString() {
        return "ProductDTODetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image=" + Arrays.toString(image) +
                ", imageString='" + imageString + '\'' +
                '}';
    }

}


