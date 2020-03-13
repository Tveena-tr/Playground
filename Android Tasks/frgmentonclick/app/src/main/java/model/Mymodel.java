package model;

public class Mymodel {
    private String title;
    private int type;

    public static final int One_type = 1;
    public static final int Two_type = 2;


    public Mymodel(String title, int type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
