package com.example.atvapi.model.enums;

public enum Area {
    CIENCIAS_EXATAS("Exatas"),
    BIOLOGICAS("Biológicas"),
    HUMANAS("humanas"),
    SOCIAIS_APLICADAS("Sociais"),
    ENGENHARIA("Engenharia"),
    AGRARIAS("Agrárias"),
    LINGUISTICAS("Línguas"),
    ARTES("Artes");

    private String area;

    private Area(String area){
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    
}