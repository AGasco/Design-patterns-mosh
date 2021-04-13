package com.codewithmosh.behavioral.command.Exercise;

public class Demo {
    public static void show(){
        var editor = new VideoEditor();
        var history = new History();
        editor.setText("");

        var setTextCommand = new SetTextCommand(editor, history, "Hello World");
        setTextCommand.execute();
        System.out.println(editor.getText());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor.getText());

        var setContrastCommand = new SetContrastCommand(editor, history, 0.9f);
        setContrastCommand.execute();
        System.out.println(editor.getContrast());

        undoCommand.execute();
        System.out.println(editor.getContrast());
    }
}
