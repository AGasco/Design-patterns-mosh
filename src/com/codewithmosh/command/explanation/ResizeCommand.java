package com.codewithmosh.command.explanation;

import com.codewithmosh.command.explanation.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
