package Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Commands.CanvasCommandController;
import com.sathiya.consoledrawcanvas.Commands.Command;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.Commands.DrawLineCommand;
import com.sathiya.consoledrawcanvas.Commands.DrawRectangleCommand;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smdgandhi
 */
public class CanvasCommandControllerTest {

    Canvas canvas = null;

    public CanvasCommandControllerTest() {
    }

    @Before
    public void setUp() {
        String[] commandLineArguments = {"35", "15"};
        CreateCanvasCommand createCanvasCommand = new CreateCanvasCommand(commandLineArguments);
        canvas = new Canvas(createCanvasCommand, new OutputDisplay());
    }

    @Test
    public void createLineCommandTest() {
        String[] cmdArg = {"1", "2", "6", "2"};;
        DrawLineCommand lineCommand = new DrawLineCommand(cmdArg);
        lineCommand.draw(canvas);
        canvas.render(new OutputDisplay());
        String commandLine = "L 1 2 6 2";
        Command command = CanvasCommandController.create(commandLine);
        assertEquals(Constants.DRAW_LINE_COMMAND, command.getName());
    }

    @Test
    public void createRectangleCommandTest() {
        String[] cmdArg = {"16", "1", "20", "3"};;
        DrawRectangleCommand rectangleCommand = new DrawRectangleCommand(cmdArg);
        rectangleCommand.draw(canvas);
        canvas.render(new OutputDisplay());
        String commandLine = "R 16 1 20 3";
        Command command = CanvasCommandController.create(commandLine);
        assertEquals(Constants.DRAW_RECTANGLE_COMMAND, command.getName());
    }

    @Test
    public void createBucketFillCommandTest() {
        String commandLine = "B 17 2 o";
        Command command = CanvasCommandController.create(commandLine);
        assertEquals(Constants.BUCKET_FILL_COMMAND, command.getName());
    }

    @Test
    public void CreateQuitCanvasCommandTest() {
        String commandLine = "Q";
        Command command = CanvasCommandController.create(commandLine);
        assertEquals(Constants.QUIT_CANVAS_COMMAND, command.getName());
    }
}
