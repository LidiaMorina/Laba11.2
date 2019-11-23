package com.company;

public class Hero extends Create {
    @Override
    public Figura createFigura() {
        return new FigureHero();
    }
}
