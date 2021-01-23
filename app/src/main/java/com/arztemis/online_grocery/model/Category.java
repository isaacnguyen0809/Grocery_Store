package com.arztemis.online_grocery.model;

public class Category {
    private int id;
    private int imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category(int id, int imageUrl) {
        this.id = id;
        this.imageUrl = imageUrl;
    }
}
