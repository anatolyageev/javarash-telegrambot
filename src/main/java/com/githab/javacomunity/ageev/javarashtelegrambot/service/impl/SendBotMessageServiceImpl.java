package com.githab.javacomunity.ageev.javarashtelegrambot.service.impl;

import com.githab.javacomunity.ageev.javarashtelegrambot.bot.JavarushTelegramBot;
import com.githab.javacomunity.ageev.javarashtelegrambot.service.SendBotMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final JavarushTelegramBot javarushTelegramBot;

    @Autowired
    public SendBotMessageServiceImpl(JavarushTelegramBot javarushTelegramBot) {
        this.javarushTelegramBot = javarushTelegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            javarushTelegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            //todo add logging to the project.
            e.printStackTrace();
        }
    }
}
