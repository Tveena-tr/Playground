package com.example.recycleexample;

public class product {



    public product( String title, String description, int image ) {

        this.title = title;
        this.description = description;
        this.image = image;
    }



    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    private String title,description;
    private int image;
}
