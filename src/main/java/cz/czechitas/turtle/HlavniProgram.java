package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        Color[] colors = new Color[]{
            new Color(255, 0, 0), // red
            new Color(0, 127, 255), // blue
            new Color(0, 0, 0), // black
            new Color(0, 255, 0) // green
        };
        int xIcecream = 200;
        int yIcecream = 300;
        icecream(xIcecream, yIcecream, colors);
        snowman(xIcecream + 300, yIcecream + 6, colors);
        train(xIcecream + 300 + 200, yIcecream + 6, colors);
    }

    public void icecream(int x, int y, Color[] colors) {
        zofka.setLocation(x, y);
        zofka.turnLeft(90);

        drawColorCircle(90, 60, colors[3]);
        zofka.setLocation(x + 85, y - 70);
        drawsColorTriangle(180, 300, colors[0]);
    }

    public void snowman(int x, int y, Color[] colors) {
        zofka.setLocation(x, y);
        drawColorCircle(60, 60, colors[2]);
        zofka.setLocation(x, y + 160);
        drawColorCircle(80, 80, colors[2]);
        zofka.setLocation(x, y + 400);
        drawColorCircle(120, 100, colors[2]);

        //ručičky
        zofka.setLocation(x + 100, y + 90);
        drawColorCircle(20, 70, colors[2]);
        zofka.setLocation(x - 105, y + 90);
        drawColorCircle(20, 70, colors[2]);
    }

    public void train(int x, int y, Color[] colors) {





    }

    public void drawsColorTriangle(double sideLength, Color penColor) {
        drawsColorTriangle(sideLength, sideLength, penColor);
    }

    public void drawsColorTriangle(double baseLength, double sideLength, Color penColor) {
        double uhelA = 180 - (Math.toDegrees(Math.acos((baseLength / 2) / sideLength)));
        double uhelB = 360 - (2 * uhelA);

        zofka.penDown();
        zofka.setPenColor(penColor);

        zofka.move(baseLength);
        zofka.turnLeft(uhelA);

        zofka.move(sideLength);
        zofka.turnLeft(uhelB);

        zofka.move(sideLength);
        zofka.turnLeft(uhelA);

        zofka.penUp();
    }

    public void drawsColorRectangle(double sideLengthA, double sideLengthB, Color penColor) {
        zofka.penDown();
        zofka.setPenColor(penColor);

        for (int i = 0; i < 2; i++) {
            zofka.move(sideLengthA);
            zofka.turnLeft(90.0);
            zofka.move(sideLengthB);
            zofka.turnLeft(90.0);
        }
        zofka.penUp();
    }

    public void drawColorSquare(double sideLength, Color penColor) {
        drawsColorRectangle(sideLength,sideLength, penColor);
    }

    public void drawColorCircle(double radius, int segments, Color penColor) {
        zofka.penDown();
        zofka.setPenColor(penColor);

        for (int i = 0; i < segments; i++) {
            zofka.move(2 * Math.PI * radius / segments); // Dopředný pohyb (vypočtený podle obvodu kruhu a počtu stran)
            zofka.turnRight(360.0 / segments); // Otočení želvičky o správný úhel
        }
        zofka.penUp();
    }
}
