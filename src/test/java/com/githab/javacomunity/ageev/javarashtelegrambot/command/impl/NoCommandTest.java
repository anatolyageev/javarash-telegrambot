package com.githab.javacomunity.ageev.javarashtelegrambot.command.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.Command;
import org.junit.jupiter.api.DisplayName;


import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.NO;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
