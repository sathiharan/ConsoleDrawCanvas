package com.sathiya.consoledrawcanvas;

import com.sathiya.consoledrawcanvas.Controller.ConsoleDrawCansvasController;

/**
 *
 * @author smdgandhi
 */
public class MainConsoleDrawCanvas {

    public static void main(String[] args) {
        OutputDisplay output = new OutputDisplay();
        ConsoleDrawCansvasController consoleDrawCansvasController = new ConsoleDrawCansvasController();
        consoleDrawCansvasController.run(output);
    }

}
