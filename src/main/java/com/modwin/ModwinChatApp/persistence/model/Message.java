package com.modwin.ModwinChatApp.persistence.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id",unique = true, nullable = false)
    private Integer ID;

    @ManyToOne
    private Chat chat;

    private String text;

    private LocalDateTime published;

}
