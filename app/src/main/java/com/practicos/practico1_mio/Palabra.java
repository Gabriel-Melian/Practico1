package com.practicos.practico1_mio;

import java.io.Serializable;

public class Palabra implements Serializable {

    private String palabraEspanol;
    private String palabraIngles;
    private int img;

    public Palabra(String palabraEspanol, String palabraIngles, int img) {
        this.palabraEspanol = palabraEspanol;
        this.palabraIngles = palabraIngles;
        this.img = img;
    }

    public Palabra() {

    }

    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setPalabraIngles(String palabraIngles) {
        this.palabraIngles = palabraIngles;
    }

    public void setPalabraEspanol(String palabraEspanol) {
        this.palabraEspanol = palabraEspanol;
    }
}
