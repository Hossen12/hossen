package com.example.miniapp_hossen.ui.first.util;

public class Product {
    private int id;
    private String neme;
    private String catagory;
    private String description;
    private  int price;

    public Product(int id, String neme, String catagory, String description, float price) {
        this.id = id;
        this.neme = neme;
        this.catagory = catagory;
        this.description = description;
        this.price = (int) price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = (int) price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", neme='" + neme + '\'' +
                ", catagory='" + catagory + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
