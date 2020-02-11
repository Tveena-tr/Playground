package com.example.recycle_multi;

public class Product {
    private int id;
    private String title;
    private String desc;
    private int image1 ,image2;



    public int getId() {
        return id;
    }

    public Product(int id, String title, String desc, int image1, int image2) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.image1 = image1;
        this.image2 = image2;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }


}
