package com.sofrosyn.podpitara.Modals;

public class Show {

private String name;
private int image;

    public Show() {
    }

    public Show(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
