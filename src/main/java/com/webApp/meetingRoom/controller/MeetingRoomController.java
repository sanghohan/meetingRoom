package com.webApp.meetingRoom.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingRoomController {

    @RequestMapping("/")
    String home() {
        return "Hello World!!!!";
    }

}