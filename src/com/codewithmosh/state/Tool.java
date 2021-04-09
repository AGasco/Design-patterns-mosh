package com.codewithmosh.state;

public abstract class Tool {
    public ToolType type;
    public abstract void mouseDown();
    public abstract void mouseUp();
    public ToolType getType(){
        return type;
    }
}
