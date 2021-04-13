package com.codewithmosh.behavioral.command.Exercise;

public class SetContrastCommand implements UndoableCommand{
    private float prevContrast, newContrast;
    private VideoEditor editor;
    private History history;

    public SetContrastCommand(VideoEditor editor, History history, float newContrast){
        this.editor = editor;
        this.history = history;
        this.newContrast = newContrast;
    }

    @Override
    public void execute() {
        prevContrast = editor.getContrast();
        editor.setContrast(newContrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }
}
