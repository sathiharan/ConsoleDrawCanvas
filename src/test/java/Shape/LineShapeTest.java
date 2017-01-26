package Shape;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import com.sathiya.consoledrawcanvas.Shapes.LineShape;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author smdgandhi
 */
public class LineShapeTest {

    Canvas canvas = null;

    @Before
    public void setUp() throws Exception {
        String[] commandLineArguments = {"35", "15"};
        CreateCanvasCommand createCanvasCommand = new CreateCanvasCommand(commandLineArguments);
        canvas = new Canvas(createCanvasCommand, new OutputDisplay());
    }

    @Test
    public void horizontalLineShapeTest() {

        LineShape lineShape = new LineShape(1, 2, 6, 2, Constants.CHAR_X);
        lineShape.draw(canvas);
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

    @Test
    public void verticalLineShapeTest() {
        LineShape lineShape = new LineShape(2, 2, 2, 9, Constants.CHAR_X);
        lineShape.draw(canvas);
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
