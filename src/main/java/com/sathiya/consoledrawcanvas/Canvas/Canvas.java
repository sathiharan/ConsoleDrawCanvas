package com.sathiya.consoledrawcanvas.Canvas;

import com.sathiya.consoledrawcanvas.Commands.Command;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import java.util.ArrayList;
import java.util.List;

/**
 * Defining Canvas
 * @author smdgandhi
 */
public class Canvas {

    private CanvasArea canvasArea;

    private int width;
    private int hight;

    private List<Command> commands = new ArrayList<Command>();

    public Canvas(CreateCanvasCommand createCommand, OutputDisplay output) {
        this.canvasArea = new CanvasArea(createCommand.getWidth(), createCommand.getHeight());
        this.width = createCommand.getWidth();
        this.hight = createCommand.getHeight();
        addCommand(createCommand, output);
    }

    public boolean addCommand(Command command, OutputDisplay output) {
        if (command != null) {
            getCommands().add(command);
            if (!Constants.QUIT_CANVAS_COMMAND.equals(command.getName())) {
                render(output);
            }
            return true;
        }
        return false;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public void render(OutputDisplay output) {
        drawCanvas();
        createCanvas(output);
    }

    public void createCanvas(OutputDisplay output) {
        drawHorizantalCanvasLine(output);
        drawVerticalCanvasLine(output);
        drawHorizantalCanvasLine(output);

    }

    private void drawCanvas() {
        for (Command command : commands) {
            command.draw(this);
        }
    }

    public void drawHorizantalCanvasLine(OutputDisplay output) {
        for (int i = 0; i < width + 2; i++) {
            output.print('-');
        }
        output.println();
    }

    public void drawVerticalCanvasLine(OutputDisplay output) {
        for (int i = 1; i < canvasArea.getHeight() + 1; i++) {
            output.print('|');
            for (int j = 1; j < canvasArea.getWidth() + 1; j++) {
                output.print(canvasArea.getElement(j, i));
            }
            output.print('|');
            output.println();
        }
    }

    public void setElement(int x, int y, char c) {
        canvasArea.setElement(x, y, c);
    }

    public Character getElement(int x, int y) {
        return canvasArea.getElement(x, y);
    }

    public CanvasArea getArea() {
        return canvasArea;
    }

    public int getWidth() {
        return canvasArea.getWidth();
    }

    public int getHeight() {
        return canvasArea.getHeight();
    }
}
