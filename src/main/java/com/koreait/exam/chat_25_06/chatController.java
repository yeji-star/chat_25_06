package com.koreait.exam.chat_25_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class chatController {

    private List<chatMessage> chatMessages = new ArrayList<>();

    public record writeChatMessageResponse(long id) {

    }


    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<writeChatMessageResponse> writeMessage() {
        chatMessage message = new chatMessage("홍길동", "안녕");

        chatMessages.add(message);

        return new RsData<>(
                "S-1",
                "메세지가 작성됨",
                new writeChatMessageResponse(message.getId()));
    }
}
