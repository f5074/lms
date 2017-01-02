package lms.lms.attendance.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import lms.lms.attendance.dao.mapper.AttendanceMapper;
import lms.lms.common.domain.Attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AttendanceDaoImpl implements AttendanceDao{
	@Autowired private AttendanceMapper attendanceMapper;
	
	@Override
	public int checkInTime(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkInTime(userNo);
	}

	@Override
	public List<Attendance> attendanceList() {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceList();
	}

	@Override
	public int checkInSMS(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkInSMS(userNo);
	}

	@Override
	public List<Attendance> checkInSMS2(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkInSMS2(userNo);
	}

	@Override
	public int checkOutTime(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkOutTime(userNo);
	}

	@Override
	public int checkOutSMS(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkOutSMS(userNo);
	}

	@Override
	public List<Attendance> checkOutSMS2(int userNo) {
		// TODO Auto-generated method stub
		return attendanceMapper.checkOutSMS2(userNo);
	}





}
