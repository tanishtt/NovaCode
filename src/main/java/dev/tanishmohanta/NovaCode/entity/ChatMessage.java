package dev.tanishmohanta.NovaCode.entity;

import dev.tanishmohanta.NovaCode.enums.MessageRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ChatMessage {
    private Long id;
    private ChatSession chatSession;
    private String content;
    private MessageRole role;
    private String toolCalls;//json array of tools called
    private Integer tokenUsed;

    private Instant createdAt;

}
