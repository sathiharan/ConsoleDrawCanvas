package com.sathiya.consoledrawcanvas.Commands;

import com.sathiya.consoledrawcanvas.Canvas.Canvas;
import com.sathiya.consoledrawcanvas.Constants;

/**
 *
 * @author smdgandhi
 */
public class Command {
    
    private String name;
    
    String[] cmd;    

    public Command(String command) {
        this.name = command;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String[] getCmdArgument(String command){        
        return cmd = command.split(Constants.EMPTY_SPACE_SEPARATOR);
    }
    
    public void draw(Canvas canvas) {
    }   
}
