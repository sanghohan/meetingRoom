package com.webApp.meetingRoom.controller;


import com.fasterxml.jackson.annotation.JsonView;
import com.webApp.meetingRoom.vo.RequestReservationRoom;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.nio.file.Path;

@RestController
public class MeetingRoomApiController {

    /*회의실 예약 내역 보기 */
    @RequestMapping(value = "/get/reservationList/{month}/{day}/v1", method=RequestMethod.GET)
    public Object reservationList(@PathVariable int month, @PathVariable int day) {
    ModelAndView modelAndView = new ModelAndView();


        return null;
    }


    /*회의실 예약*/
    @RequestMapping(value = "/do/reservation/v1", method=RequestMethod.POST)
    public Object reservationList(RequestReservationRoom reservationRoom) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("test", "hello world!");

        return modelAndView;
    }


    /*미팅룸 정보
    * 이름...
    * 수용 인원.
    * 등.
    * */
    @RequestMapping(value = "/get/meetingRoomInfos/v1", method=RequestMethod.GET)
    public Object meetingRooms() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("test", "hello world!");

        return modelAndView;
    }


}
