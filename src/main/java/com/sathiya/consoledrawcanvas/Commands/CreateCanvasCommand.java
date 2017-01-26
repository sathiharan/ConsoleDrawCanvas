package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Constants;

/**
 * Defined to Create Canvas
 *
 * @author smdgandhi
 */
public class CreateCanvasCommand extends Command {

    private int width;
    private int height;

    public CreateCanvasCommand(String[] commandArguments) {
        super(Constants.CREATE_CANVAS_COMMAND);
        width = Integer.parseInt(commandArguments[0]);
        height = Integer.parseInt(commandArguments[1]);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
