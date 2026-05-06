package com.example.sec.model.enums;

public enum Tecnologia {
    UNREAL_ENGINE("Unreal"),
    UNITY("Unity"),
    GODOT("Godot"),
    GAME_MAKER("Game Maker"),
    CONSTRUCT("Construct");

    private String tec;

    private Tecnologia(String tec){
        this.tec = tec;
    }

    public String getTec() {
        return tec;
    }

    
}
