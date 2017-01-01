package lms.lms.attendance.service;

import java.util.List;

import lms.lms.attendance.dao.AttendanceDao;
import lms.lms.common.domain.Attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service          
public class AttendanceServiceImpl implements AttendanceService{
	@Autowired private AttendanceDao attendanceDao;
	
	@Override
	public int checkInTime(int userNo) {
		// TODO Auto-generated method stub
		return attendanceDao.checkInTime(userNo);
	}

	@Override
	public List<Attendance> attendanceList() {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceList();
	}

	@Override
	public int checkInSMS(int userNo) {
		// TODO Auto-generated method stub
		return attendanceDao.checkInSMS(userNo);
	}

	@Override
	public List<Attendance> checkInSMS2(int userNo) {
		// TODO Auto-generated method stub
		return attendanceDao.checkInSMS2(userNo);
	}

}
