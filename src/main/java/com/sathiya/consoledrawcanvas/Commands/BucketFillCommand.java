package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Constants;

/**
 * This class BucketFillCommand is used to fill the color.
 * @author smdgandhi
 */
public class BucketFillCommand extends Command {

    private int x1;
    private int y1;
    private char color;

    public BucketFillCommand(String[] commandArguments) {
        super(Constants.BUCKET_FILL_COMMAND);
        this.x1 = Integer.parseInt(commandArguments[0]);
        this.y1 = Integer.parseInt(commandArguments[1]);
        this.color = commandArguments[2].charAt(0);
    }

    public void draw(Canvas canvas) {
        doBucketFill(canvas, x1, y1, color);
    }

    //Recursive function to fill the canvas
    public void doBucketFill(Canvas canvas, int col, int row, char color) {
        if (Constants.CHAR_X.equals(canvas.getElement(col, row)) || canvas.getElement(col, row).equals(color)) {
            return;
        }
        if (col >= 1 && col < canvas.getWidth() + 1 && row >= 1 && row < canvas.getHeight() + 1) {
            if (Character.isSpaceChar(canvas.getElement(col, row))) {
                canvas.setElement(col, row, color);
            }
            doBucketFill(canvas, col - 1, row, color);
            doBucketFill(canvas, col + 1, row, color);
            doBucketFill(canvas, col, row - 1, color);
            doBucketFill(canvas, col, row + 1, color);
        }
    }
}
