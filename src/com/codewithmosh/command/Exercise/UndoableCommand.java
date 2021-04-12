package com.codewithmosh.command.Exercise;

public interface UndoableCommand extends Command{
    void unexecute();
}
