package com.example.recycle_multi;

public class Product {

    private String title;
    private String desc;
    private int image1, image2;

    public Product(String title, String desc, int image1, int image2) {
        this.title = title;
        this.desc = desc;
        this.image1 = image1;
        this.image2 = image2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}