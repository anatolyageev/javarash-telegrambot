package com.githab.javacomunity.ageev.javarashtelegrambot.command.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.Command;
import org.junit.jupiter.api.DisplayName;


import static com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return "/jkojpj";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
