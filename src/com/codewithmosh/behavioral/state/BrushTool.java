package com.codewithmosh.behavioral.state;

public class BrushTool extends Tool{
    private ToolType type = ToolType.BRUSH;

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }

    public ToolType getType() {
        return type;
    }
}
