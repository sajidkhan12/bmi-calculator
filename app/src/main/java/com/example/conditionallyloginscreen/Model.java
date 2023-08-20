package com.example.conditionallyloginscreen;

public class Model {
    String papa;
    String qeen;
    String image;
    String late;

    public Model(String p, String q,String m,String l) {
        this.papa = p;
        this.qeen = q;
        this.image=m;
        this.late=l;
    }

    public String getP() {
        return papa;
    }

    @SuppressWarnings("unused")
    public void setP(String p) {
        this.papa = p;
    }

    public String getQ() {
        return qeen;
    }

    @SuppressWarnings("unused")
    public void setQ(String q) {
        this.qeen= q;
    }

    @SuppressWarnings("unused")
    public String getImage() {
        return image;
    }

    @SuppressWarnings("unused")
    public void setImage(String image) {
        this.image = image;
    }

    @SuppressWarnings("unused")
    public String getLate() {
        return late;
    }

    @SuppressWarnings("unused")
    public void setLate(String late) {
        this.late = late;
    }
}
