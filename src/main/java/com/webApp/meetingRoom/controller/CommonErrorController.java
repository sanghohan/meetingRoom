package com.webApp.meetingRoom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class CommonErrorController {

	public CommonErrorController() {
		;
	}
	
	@RequestMapping("/common/error")
	public String handleError() {
		log.info("Detected UI exception .. ");
		return "error" ;
	}
	
}
