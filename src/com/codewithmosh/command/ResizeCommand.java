package com.codewithmosh.command;

import com.codewithmosh.command.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
