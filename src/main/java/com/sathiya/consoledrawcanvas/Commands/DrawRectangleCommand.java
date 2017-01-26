package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.Shapes.RectangleShape;

/**
 * Defined to Draw Rectangle.
 *
 * @author smdgandhi
 */
public class DrawRectangleCommand extends Command {

    RectangleShape rectangle;

    public DrawRectangleCommand(String[] commandArguments) {
        super(Constants.DRAW_RECTANGLE_COMMAND);
        int x1 = Integer.parseInt(commandArguments[0]);
        int y1 = Integer.parseInt(commandArguments[1]);
        int x2 = Integer.parseInt(commandArguments[2]);
        int y2 = Integer.parseInt(commandArguments[3]);
        rectangle = new RectangleShape(x1, y1, x2, y2);
    }

    public void draw(Canvas canvas) {
        rectangle.draw(canvas);
    }

}
