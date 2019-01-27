package com.webApp.meetingRoom.controller.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class ViewController {


    /*회의실 예약 뷰*/
    @RequestMapping(value = "/view/reservation", method= RequestMethod.GET)
    public String veiewReservationPage() {

        return "hello world";
    }
}
