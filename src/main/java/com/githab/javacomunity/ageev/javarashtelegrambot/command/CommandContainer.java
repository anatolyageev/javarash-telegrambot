package com.githab.javacomunity.ageev.javarashtelegrambot.command;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.HelpCommand;
import com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.NoCommand;
import com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.StartCommand;
import com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.StopCommand;
import com.githab.javacomunity.ageev.javarashtelegrambot.command.impl.UnknownCommand;
import com.githab.javacomunity.ageev.javarashtelegrambot.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.HELP;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.NO;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.START;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.STOP;

public class CommandContainer {

    private final ImmutableMap<String, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {

        commandMap = ImmutableMap.<String, Command>builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
