package com.company;
/*Фабричный метод*/
public class Main {
    private static Create create;
    public static void main(String[] args) {
        int max = 8;
        int min = 1;

        for (int i = 0; i < max; i++) {
            int rand = (int) ((Math.random() * ((max - min) + 1)) + min);
            switch (rand) {
                case (1):
                    figure = new FigureClevelandZ();
                    break;
                case (2):
                    figure = new FigureHero();
                    break;
                case (3):
                    figure = new FigureOrangeRicky();
                    break;
                case (4):
                    figure = new FigureRhodeIslandZ();
                    break;
                case (5):
                    figure = new FigureSmashboy();
                    break;
                case (6):
                    figure = new SuperFigure();
                    break;
                case (7):
                    figure = new FigureTeewee();

                case (8):
                    figure = new FigureBlueRicky();
                    break;
            }
        }
    }
}
