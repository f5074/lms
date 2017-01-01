package lms.lms.attendance.dao;

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

}
