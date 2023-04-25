package com.lathief.websocketdemo.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
}