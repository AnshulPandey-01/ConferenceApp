package com.anshul.conference_app.models;

public record ChatMessage(
        String clientId,
        String who,
        String text,
        long ts
) {}
