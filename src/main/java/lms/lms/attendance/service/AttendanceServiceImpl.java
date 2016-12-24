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
	public int attendanceInsert(String userId) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceInsert(userId);
	}

	@Override
	public int attendanceUpdate(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceUpdate(attendance);
	}

	@Override
	public int attendanceDelete(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceDelete(attendance);
	}

	@Override
	public List<Attendance> attendanceList() {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceList();
	}

	@Override
	public Attendance attendanceView(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceDao.attendanceView(attendance);
	}

}
