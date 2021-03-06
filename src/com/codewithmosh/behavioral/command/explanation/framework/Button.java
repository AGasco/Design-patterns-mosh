package com.codewithmosh.behavioral.command.explanation.framework;

public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
