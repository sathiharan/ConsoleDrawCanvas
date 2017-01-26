package com.sathiya.consoledrawcanvas.CommandLineScanner;

import java.util.Scanner;

/**
 * This class CommandLineScannerCanvas is used to read the values from the User.
 *
 * @author smdgandhi
 */
public class CommandLineScannerCanvas {

    public String cmdScanner(Scanner scan) {
        String command = new String();
        System.out.print("Enter Command:");
        command = scan.nextLine();
        return command;
    }

    public void close(Scanner scan) {
        scan.close();
    }

}
