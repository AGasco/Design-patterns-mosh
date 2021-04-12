package com.codewithmosh.command.explanation;

import com.codewithmosh.command.explanation.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
