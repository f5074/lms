package lms.lms.seat.service;

import java.util.List;

import lms.lms.common.domain.Seat;

public interface SeatService {
	
	//좌석관리 리스트 출력
	List<Seat> seatList();
	
}
