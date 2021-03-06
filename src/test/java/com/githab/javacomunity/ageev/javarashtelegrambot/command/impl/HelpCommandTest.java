package com.githab.javacomunity.ageev.javarashtelegrambot.command.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.Command;
import org.junit.jupiter.api.DisplayName;


import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.HELP;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
