package com.sathiya.consoledrawcanvas.Shapes;

import com.sathiya.consoledrawcanvas.Constants;

/**
 * Defining Rectangle Shape.
 *
 * @author smdgandhi
 */
public class RectangleShape extends ImplementShape {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private LineShape topBorder;
    private LineShape leftBorder;
    private LineShape bottonBorder;
    private LineShape rigthBorder;

    public RectangleShape(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        topBorder = new LineShape(x1, y1, x2, y1, Constants.CHAR_X);
        leftBorder = new LineShape(x1, y1, x1, y2, Constants.CHAR_X);
        bottonBorder = new LineShape(x1, y2, x2, y2, Constants.CHAR_X);
        rigthBorder = new LineShape(x2, y1, x2, y2, Constants.CHAR_X);
        getLineShapes().add(topBorder);
        getLineShapes().add(leftBorder);
        getLineShapes().add(bottonBorder);
        getLineShapes().add(rigthBorder);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}