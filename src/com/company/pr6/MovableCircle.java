package com.company.pr6;
import com.company.pr5.Circle;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(double border, double radius, int x, int y) {
        super(radius, border);
        center = new MovablePoint(x, y);
    }

    @Override
    public void move(int x, int y) {
        center.move(x, y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
