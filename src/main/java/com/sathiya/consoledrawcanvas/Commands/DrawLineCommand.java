package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.Shapes.LineShape;

/**
 * Defined to Draw Line.
 *
 * @author smdgandhi
 */
public class DrawLineCommand extends Command {

    LineShape lineShape;

    public DrawLineCommand(String[] commandArguments) {
        super(Constants.DRAW_LINE_COMMAND);
        int x1 = Integer.parseInt(commandArguments[0]);
        int y1 = Integer.parseInt(commandArguments[1]);
        int x2 = Integer.parseInt(commandArguments[2]);
        int y2 = Integer.parseInt(commandArguments[3]);
        lineShape = new LineShape(x1, y1, x2, y2, Constants.CHAR_X);
    }

    public void draw(Canvas canvas) {
        lineShape.draw(canvas);
    }
}
