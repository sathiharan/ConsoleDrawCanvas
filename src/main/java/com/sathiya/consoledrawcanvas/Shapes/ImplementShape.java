package com.sathiya.consoledrawcanvas.Shapes;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smdgandhi
 */
public class ImplementShape extends Shape {

    List<IShape> shapes = new ArrayList<IShape>();
    List<LineShape> lineShapes = new ArrayList<LineShape>();

    public List<LineShape> getLineShapes() {
        return lineShapes;
    }

    public void setLineShapes(List<LineShape> lineShapes) {
        this.lineShapes = lineShapes;
    }

    public List<IShape> getShapes() {
        return shapes;
    }

    public void setShapes(List<IShape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw(Canvas canvas) {
        for (IShape shape : shapes) {
            shape.draw(canvas);
        }
        for (LineShape lineShape : lineShapes) {
            lineShape.draw(canvas);
        }
    }
}
