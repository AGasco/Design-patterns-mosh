package com.codewithmosh.behavioral.command.explanation;

import com.codewithmosh.behavioral.command.explanation.framework.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
