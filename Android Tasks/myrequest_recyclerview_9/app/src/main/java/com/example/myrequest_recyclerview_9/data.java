package com.example.myrequest_recyclerview_9;

public class data {
 private int image1,image2;
 private String title;

    public data(int image1, int image2, String title) {
        this.image1 = image1;
        this.image2 = image2;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
