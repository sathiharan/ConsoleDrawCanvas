package Canvas;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Commands.Command;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import com.sathiya.consoledrawcanvas.Constants;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smdgandhi
 */
public class CanvasTest {

    Canvas canvas;

    @Before
    public void setUp() {
        String[] commandLineArguments = {"35", "15"};
        CreateCanvasCommand createCanvasCommand = new CreateCanvasCommand(commandLineArguments);
        canvas = new Canvas(createCanvasCommand, new OutputDisplay());
    }

    @Test
    public void createCanvasCommand() {
        assertNotNull(canvas.getArea());
        assertEquals(35, canvas.getWidth());
        assertEquals(15, canvas.getHeight());
        assertEquals(1, canvas.getCommands().size());
        assertEquals(Constants.CREATE_CANVAS_COMMAND, canvas.getCommands().get(0).getName());
    }

    @Test
    public void nullAddCommandTest() {
        Command command = null;
        assertEquals(false, canvas.addCommand(command, new OutputDisplay()));

    }
}
