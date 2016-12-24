package lms.lms.seat.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lms.lms.common.domain.Seat;
import lms.lms.seat.dao.mapper.SeatMapper;

@Repository
public class SeatDaoImpl implements SeatDao{
	@Autowired private SeatMapper seatMapper;	
	
	@Override
	public int seatInsert(Seat seat) {
		// TODO Auto-generated method stub
		return seatMapper.seatInsert(seat);
	}

	@Override
	public int seatUpdate(Seat seat) {
		// TODO Auto-generated method stub
		return seatMapper.seatUpdate(seat);
	}

	@Override
	public int seatDelete(Seat seat) {
		// TODO Auto-generated method stub
		return seatMapper.seatDelete(seat);
	}

	@Override
	public List<Seat> seatList() {
		// TODO Auto-generated method stub
		return seatMapper.seatList();
	}

	@Override
	public Seat seatView(Seat seat) {
		// TODO Auto-generated method stub
		return seatMapper.seatView(seat);
	}

}
