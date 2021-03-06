package com.githab.javacomunity.ageev.javarashtelegrambot.command.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.Command;
import org.junit.jupiter.api.DisplayName;


import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.STOP;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
