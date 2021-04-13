package com.codewithmosh.behavioral.command.Exercise;

public interface UndoableCommand extends Command{
    void unexecute();
}
