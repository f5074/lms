package lms.lms.seat.controller;

import java.util.List;

import lms.lms.common.domain.Seat;
import lms.lms.seat.service.SeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeatController {
	@Autowired private SeatService seatService;
	
	//좌석목록보기
	@RequestMapping("/seat")
	public String seat(Model model){
		List<Seat> seat = seatService.seatList();
		model.addAttribute("seat", seat);
		return "/seat/seat";
	}
	
	
	
}
