package lms.lms.seat.service;

import java.util.List;

import lms.lms.common.domain.Seat;

public interface SeatService {
	int seatInsert(Seat seat);
	int seatUpdate(Seat seat);
	int seatDelete(Seat seat);
	List<Seat> seatList();
	Seat seatView(Seat seat);

}
