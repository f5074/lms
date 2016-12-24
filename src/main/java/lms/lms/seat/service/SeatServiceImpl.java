package lms.lms.seat.service;

import java.util.List;

import lms.lms.common.domain.Seat;
import lms.lms.seat.dao.SeatDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl implements SeatService{
	@Autowired private SeatDao seatDao;
	
	@Override
	public int seatInsert(Seat seat) {
		// TODO Auto-generated method stub
		return seatDao.seatInsert(seat);
	}

	@Override
	public int seatUpdate(Seat seat) {
		// TODO Auto-generated method stub
		return seatDao.seatUpdate(seat);
	}

	@Override
	public int seatDelete(Seat seat) {
		// TODO Auto-generated method stub
		return seatDao.seatDelete(seat);
	}

	@Override
	public List<Seat> seatList() {
		// TODO Auto-generated method stub
		return seatDao.seatList();
	}

	@Override
	public Seat seatView(Seat seat) {
		// TODO Auto-generated method stub
		return seatDao.seatView(seat);
	}

}
