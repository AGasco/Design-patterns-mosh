package com.codewithmosh.command;

import com.codewithmosh.command.framework.Command;

import java.sql.SQLOutput;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
