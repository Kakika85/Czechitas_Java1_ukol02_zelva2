package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

        Color redColor = new Color(255, 0, 0);
        Color blueColor = new Color(0, 127, 255);
        Color blackColor = new Color(0, 0, 0);
        Color greenColor = new Color(0, 255, 0);

    }

    public void drawsColorTriangle(double sideLength, Color penColor) {
        zofka.penDown();
        zofka.setPenColor(penColor);

        for (int i = 0; i < 3; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(120.0);
        }
        zofka.penUp();
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
        zofka.penDown();
        zofka.setPenColor(penColor);

        for (int i = 0; i < 4; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(90);
        }
        zofka.penUp();
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
