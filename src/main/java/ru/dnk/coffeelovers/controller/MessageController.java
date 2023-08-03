package ru.dnk.coffeelovers.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import ru.dnk.coffeelovers.domain.Message;
import ru.dnk.coffeelovers.repository.MessageRepository;

@RestController
@RequestMapping("/api/1/message")
public class MessageController {
    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public Iterable<Message> getMessage() {
        return messageRepository.findAll();
    }

    @PostMapping
    public void addMessage(HttpServletRequest httpServletRequest) {
        Message message = new Message();
        message.setMessage(httpServletRequest.getParameter("text"));
        messageRepository.save(message);
    }

}
