package com.opencode.alumxbackend.groupchatmessages.dto;

import lombok.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupMessageResponse {
    private Long id;
    private Long senderUserId;
    private String senderUsername;
    private String content;
    private LocalDateTime createdAt;
}
