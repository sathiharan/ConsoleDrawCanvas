package Shape;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
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
public class RectangleShapeTest {

    Canvas canvas = null;

    @Before
    public void setUp() {
        String[] commandLineArguments = {"35", "15"};
        CreateCanvasCommand createCanvasCommand = new CreateCanvasCommand(commandLineArguments);
        canvas = new Canvas(createCanvasCommand, new OutputDisplay());
    }

    @Test
    public void rectangleBucketFillTest() {

        String[] rectangleCommandLineArguments = {"9", "1", "18", "5"};
        DrawRectangleCommand drawRectangleCommand = new DrawRectangleCommand(rectangleCommandLineArguments);
        drawRectangleCommand.draw(canvas);
        canvas.render(new OutputDisplay());

        for (int i = 1; i < canvas.getHeight() + 1; i++) {
            for (int j = 1; j < canvas.getWidth() + 1; j++) {
                char content = canvas.getArea().getElement(j, i);
                switch (content) {
                    case ' ':
                        assertEquals(Character.valueOf(' '), canvas.getArea().getElement(j, i));
                        break;
                    case 'X':
                        assertEquals(Constants.CHAR_X, canvas.getArea().getElement(j, i));
                        break;

                }
            }
        }

    }

}
