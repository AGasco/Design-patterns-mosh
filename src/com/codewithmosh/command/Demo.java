package com.codewithmosh.command;

import com.codewithmosh.command.framework.Button;

public class Demo {
    public static void show(){
        //First example
        //var service = new CustomerService();
        //var command = new AddCustomerCommand(service);
        //var button = new Button(command);
        //button.click();

        //Second example: Composite Commands
        //We can add a lot of commands to the queue, and with execute(), all of them will be executed in order
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}
