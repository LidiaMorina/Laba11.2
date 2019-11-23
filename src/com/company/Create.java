package com.company;

public abstract class Create {
    public abstract Figura createFigura();
    public void create() {
        Figura figura = createFigura();
        figura.getFigure();
    }
}
