package com.codewithmosh.behavioral.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
