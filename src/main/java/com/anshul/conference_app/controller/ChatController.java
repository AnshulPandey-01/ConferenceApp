package com.anshul.conference_app.controller;

import com.anshul.conference_app.models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	
    @MessageMapping("/resume")
    @SendTo("/start/initial")
    public ChatMessage chat(ChatMessage msg) {
        System.out.println(">> Received in controller: " + msg);
        return msg;
    }
}
