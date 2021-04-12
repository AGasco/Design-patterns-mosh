package com.codewithmosh.command.editor;

public class Demo {

    public static void show(){
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
