package com.codewithmosh.command.Exercise;

public class SetTextCommand implements UndoableCommand{
    private String prevText, newText;
    private VideoEditor editor;
    private History history;

    public SetTextCommand(VideoEditor editor, History history, String newText){
        this.editor = editor;
        this.history = history;
        this.newText = newText;
    }


    @Override
    public void execute() {
        prevText = editor.getText();
        editor.setText(newText);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setText(prevText);
    }
}
