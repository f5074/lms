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
	public List<Seat> seatList() {
		// TODO Auto-generated method stub
		return seatMapper.seatList();
	}

}
