package Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Commands.BucketFillCommand;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.Commands.DrawRectangleCommand;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author smdgandhi
 */
public class BucketFillCommandTest {

    Canvas canvas = null;

    @Before
    public void setUp() {
        String[] commandLineArguments = {"35", "15"};
        CreateCanvasCommand createCanvasCommand = new CreateCanvasCommand(commandLineArguments);
        canvas = new Canvas(createCanvasCommand, new OutputDisplay());
    }

    @Test
    public void bucketFillTest() {
        String[] commandLineArguments = {"2", "4", "o"};
        BucketFillCommand bucketFillCommand = new BucketFillCommand(commandLineArguments);
        bucketFillCommand.draw(canvas);
        canvas.render(new OutputDisplay());
        for (int i = 1; i < canvas.getHeight() + 1; i++) {
            for (int j = 1; j < canvas.getWidth() + 1; j++) {
                assertEquals("o", canvas.getArea().getElement(j, i).toString());
            }
        }

    }

    @Test
    public void rectangleBucketFillTest() {
        String[] commandLineArguments = {"12", "3", "o"};
        BucketFillCommand bucketFillCommand = new BucketFillCommand(commandLineArguments);
        String[] rectangleCommandLineArguments = {"9", "1", "18", "5"};
        DrawRectangleCommand drawRectangleCommand = new DrawRectangleCommand(rectangleCommandLineArguments);
        drawRectangleCommand.draw(canvas);
        bucketFillCommand.draw(canvas);
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
                    case 'o':
                        assertEquals(Character.valueOf('o'), canvas.getArea().getElement(j, i));
                        break;

                }
            }
        }

    }
}
