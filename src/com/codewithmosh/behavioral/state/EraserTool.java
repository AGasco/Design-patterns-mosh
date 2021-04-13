package com.codewithmosh.behavioral.state;

public class EraserTool extends Tool{
    private ToolType type = ToolType.ERASER;

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }

    public ToolType getType() {
        return type;
    }
}
