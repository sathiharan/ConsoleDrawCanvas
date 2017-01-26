package com.sathiya.consoledrawcanvas.Controller;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.CommandLineScanner.CommandLineScannerCanvas;
import com.sathiya.consoledrawcanvas.Commands.CanvasCommandController;
import com.sathiya.consoledrawcanvas.Commands.Command;
import com.sathiya.consoledrawcanvas.Commands.CreateCanvasCommand;
import com.sathiya.consoledrawcanvas.Constants;
import com.sathiya.consoledrawcanvas.OutputDisplay;
import java.util.Scanner;

/**
 * This class ConsoleDrawCansvasController is used to control 
 * the complete flow of the Console Canvas project. It controls 
 * CommandLineScannerCanvas, Command, OutputDisplay, CanvasCommandController 
 * to perform the operation of create canvas, Draw Line, Draw Rectangle and Bucket Fill
 * 
 * @author smdgandhi
 */
public class ConsoleDrawCansvasController {
   
    public void run(OutputDisplay output){
        
        Scanner scan = new Scanner(System.in);
        
        CommandLineScannerCanvas commandLineScannerCanvas = new CommandLineScannerCanvas();
        String cmdLine = null;
        Command command = new Command(cmdLine);
        if (cmdLine == null) {
            cmdLine = commandLineScannerCanvas.cmdScanner(scan);
            command = CanvasCommandController.create(cmdLine);
        }
        Canvas canvas = new Canvas((CreateCanvasCommand)command,output);
        while (!Constants.QUIT_CANVAS_COMMAND.equals(cmdLine))
         {
            command = null;
            cmdLine = commandLineScannerCanvas.cmdScanner(scan);
            try {
                command = CanvasCommandController.create(cmdLine);
                if (!cmdLine.isEmpty() && !canvas.addCommand(command, output)) {
                    output.print("Wrong command");
                    output.println();
                }
            } catch (Exception e) {
                output.print("Exception Occured: " + e);
                output.println();
            }
        }
        commandLineScannerCanvas.close(scan);   
    }
    
}
