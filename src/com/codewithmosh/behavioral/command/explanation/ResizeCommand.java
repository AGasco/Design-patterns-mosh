package com.codewithmosh.behavioral.command.explanation;

import com.codewithmosh.behavioral.command.explanation.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
