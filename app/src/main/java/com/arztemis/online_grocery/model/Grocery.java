package com.arztemis.online_grocery.model;

public class Grocery {
    private int id;
    private int imgaeurl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgaeurl() {
        return imgaeurl;
    }

    public void setImgaeurl(int imgaeurl) {
        this.imgaeurl = imgaeurl;
    }

    public Grocery(int id, int imgaeurl) {
        this.id = id;
        this.imgaeurl = imgaeurl;
    }
}
