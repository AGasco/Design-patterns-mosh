package com.codewithmosh.behavioral.state;

public class SelectionTool extends Tool {
    private ToolType type = ToolType.SELECTION;

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle");
    }

    public ToolType getType(){
        return type;
    }
}
