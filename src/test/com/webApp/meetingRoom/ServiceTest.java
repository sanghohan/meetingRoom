package com.webApp.meetingRoom;

import com.webApp.meetingRoom.service.MeetingRoomService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ServiceTest {

    @Autowired
    MeetingRoomService meetingRoomService;

    @Test
    public void diTest() {

        Assert.assertNotNull(meetingRoomService);

    }
}
