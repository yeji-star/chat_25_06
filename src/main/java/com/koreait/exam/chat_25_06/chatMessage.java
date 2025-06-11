package com.koreait.exam.chat_25_06;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class chatMessage {
    private long id;
    private LocalDateTime createDate;
    private String authorName;
    private String content;

    public chatMessage(String authorName, String content) {
        this(1, LocalDateTime.now(), authorName, content);
    }
}
