package com.company;

public class Teewee extends Create {
    @Override
    public Figura createFigura() {
        return new FigureTeewee();
    }
}
