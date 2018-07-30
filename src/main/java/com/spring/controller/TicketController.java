package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.ETicket;

@RestController
public class TicketController {
	@RequestMapping("/my-hello")
	public String sayAvailable() {
		return "hello";

	}

	@GetMapping("/eticket")
	public ETicket getETicket() {
		ETicket et = new ETicket();
		et.setId(10);
		et.setName("debi");
		et.setCity("ctc");
		et.setFair(5000);
		et.setSms("welcome to east-coast railway");
		et.setTicketavailable("ticketavailable");
		return et;

	}

}
