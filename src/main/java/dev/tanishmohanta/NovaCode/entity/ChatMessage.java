package dev.tanishmohanta.NovaCode.entity;

import dev.tanishmohanta.NovaCode.enums.MessageRole;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Getter
@Setter
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Table(name = "chat_messages")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ChatSession chatSession;

    private String content;

    private MessageRole role;

    private String toolCalls;//json array of tools called

    private Integer tokenUsed;

    private Instant createdAt;

}
