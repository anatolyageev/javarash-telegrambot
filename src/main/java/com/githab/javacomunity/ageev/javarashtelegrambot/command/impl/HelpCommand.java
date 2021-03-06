package com.githab.javacomunity.ageev.javarashtelegrambot.command.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.command.Command;
import com.githab.javacomunity.ageev.javarashtelegrambot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;


import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.START;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.STOP;
import static com.githab.javacomunity.ageev.javarashtelegrambot.command.CommandName.HELP;

public class HelpCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨<b>Доступные команды</b>✨\n\n"

                    + "<b>Начать\\закончить работу с ботом</b>\n"
                    + "%s - начать работу со мной\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
