package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {

        int xIcecream = 200;
        int yIcecream = 300;

        drawsColorIcecream(xIcecream, yIcecream);
        drawsColorSnowman(xIcecream + 300, yIcecream - 106);
        drawsColorTrain(xIcecream + 300 + 250, yIcecream + 6);
    }

    public void drawsColorIcecream(int x, int y) {
        zofka.setLocation(x, y);
        zofka.turnLeft(90);

        drawsColorCircle(90, 60, Color.green);
        zofka.setLocation(x + 85, y - 70);
        drawsColorTriangle(180, 300, Color.red);
    }

    public void drawsColorSnowman(int x, int y) {
        zofka.setLocation(x, y);
        drawsColorCircle(60, 60, Color.black);
        zofka.setLocation(x, y + 160);
        drawsColorCircle(80, 80, Color.black);
        zofka.setLocation(x, y + 400);
        drawsColorCircle(120, 100, Color.black);

        zofka.setLocation(x + 100, y + 90);
        drawsColorCircle(20, 70, Color.black);
        zofka.setLocation(x - 105, y + 90);
        drawsColorCircle(20, 70, Color.black);

        zofka.turnRight(90);
    }

    public void drawsColorTrain(int x, int y) {

        zofka.setLocation(x + 325, y + 100);
        drawsColorRectangle(125, 250, Color.black);

        zofka.setLocation(x + 325 + 175, y + 100);
        drawsColorRectangle(250, 175, Color.blue);

        zofka.setLocation(x + 325, y + 100);
        drawsColorCircle(88, 60, Color.red);

        zofka.setLocation(x + 95, y + 146);
        drawsColorCircle(40, 60, Color.red);
        zofka.setLocation(x + 210, y + 146);
        drawsColorCircle(40, 60, Color.red);

        zofka.setLocation(x + 75, y + 20);
        zofka.turnLeft(135);
        drawsColorTriangle(125 * Math.sqrt(2), 125, Color.blue);
    }

    public void drawsColorTriangle(double baseLength, double sideLength, Color penColor) {
        double ungleA = 180 - (Math.toDegrees(Math.acos((baseLength / 2) / sideLength)));
        double ungleB = 360 - (2 * ungleA);

        zofka.penDown();
        zofka.setPenColor(penColor);

        zofka.move(baseLength);
        zofka.turnLeft(ungleA);

        zofka.move(sideLength);
        zofka.turnLeft(ungleB);

        zofka.move(sideLength);
        zofka.turnLeft(ungleA);

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

    public void drawsColorCircle(double radius, int segments, Color penColor) {
        zofka.penDown();
        zofka.setPenColor(penColor);

        for (int i = 0; i < segments; i++) {
            zofka.move(2 * Math.PI * radius / segments);
            zofka.turnRight(360.0 / segments);
        }
        zofka.penUp();
    }
}
