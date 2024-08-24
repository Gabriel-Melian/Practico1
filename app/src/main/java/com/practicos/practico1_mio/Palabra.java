package com.practicos.practico1_mio;

public class Palabra {

    private String palabraEspanol;
    private String palabraIngles;
    private String img;

    public Palabra(String palabraEspanol, String palabraIngles, String img) {
        this.palabraEspanol = palabraEspanol;
        this.palabraIngles = palabraIngles;
        this.img = img;
    }

    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public String getImg() {
        return img;
    }
}
