package com.webApp.meetingRoom.controller;


import com.webApp.meetingRoom.vo.RequestReservationRoom;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MeetingRoomController {

    /*회의실 예약 내역 보기 */
    @RequestMapping(value = "/get/reservationList/{month}/{day}/v1", method=RequestMethod.GET)
    public ModelAndView reservationList(@PathVariable int month, @PathVariable int day) {
    ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("test", "hello world!");

        return modelAndView;
    }


    /*회의실 예약*/
    @RequestMapping(value = "/do/reservation/v1", method=RequestMethod.POST)
    public ModelAndView reservationList(RequestReservationRoom reservationRoom) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("test", "hello world!");

        return modelAndView;
    }

    /*회의실 예약 뷰*/
    @RequestMapping(value = "/view/reservation/v1", method=RequestMethod.GET)
    public ModelAndView VeiewreservationPage() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("test", "hello world!");

        return modelAndView;
    }


}
