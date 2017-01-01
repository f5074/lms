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
	public List<Seat> seatList() {
		// TODO Auto-generated method stub
		return seatDao.seatList();
	}

}
