package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Constants;
import java.util.Arrays;

/**
 * This class CanvasCommandController is used to control the flow of the
 * commands C - Create Canvas, L - Draw Line, R - Draw Rectangle, B -Bucket Fill
 * and Q - Quit.
 *
 * @author smdgandhi
 */
public class CanvasCommandController {

    public static Command create(String commandLine) {
        Command cmd = new Command(commandLine);
        String[] commandLineArguments = cmd.getCmdArgument(commandLine);
        String command = commandLineArguments[0];
        String[] commandArguments = null;
        if (!Constants.QUIT_CANVAS_COMMAND.equals(command)) {
            commandArguments = Arrays.copyOfRange(commandLineArguments, 1, commandLineArguments.length);
        }
        switch (command) {
            case Constants.CREATE_CANVAS_COMMAND:
                return new CreateCanvasCommand(commandArguments);
            case Constants.DRAW_LINE_COMMAND:
                return new DrawLineCommand(commandArguments);
            case Constants.DRAW_RECTANGLE_COMMAND:
                return new DrawRectangleCommand(commandArguments);
            case Constants.BUCKET_FILL_COMMAND:
                return new BucketFillCommand(commandArguments);
            case Constants.QUIT_CANVAS_COMMAND:
                return new QuitCanvasCommand();
        }
        return null;
    }
}
