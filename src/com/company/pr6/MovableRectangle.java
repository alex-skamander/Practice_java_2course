package com.company.pr6;

import com.company.pr5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable{
    private MovablePoint topPoint;

    public MovableRectangle(int width, int height, double border, int x, int y) {
        super(width, height, border);
        topPoint = new MovablePoint(x, y);
    }

    @Override
    public void move(int x, int y)
    {
        topPoint.move(x, y);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "center=" + topPoint +
                '}';
    }
}
