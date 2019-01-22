package com.webApp.meetingRoom.vo;

import lombok.Data;

@Data
public class RequestReservationRoom {

    String meetingRoomName;
    String userName;
    String fromDateTime;
    String toDateTime;
    boolean repeat;
}
