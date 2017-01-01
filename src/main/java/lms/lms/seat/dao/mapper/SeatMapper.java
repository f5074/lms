package lms.lms.seat.dao.mapper;

import java.util.List;

import lms.lms.common.domain.Seat;

public interface SeatMapper {

	//좌석관리 리스트 출력
	List<Seat> seatList();

}
