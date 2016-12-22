package com.lms.attendance.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lms.attendance.dao.mapper.AttendanceMapper;
import com.lms.domain.Attendance;

@Repository
public class AttendanceDaoImpl implements AttendanceDao{
	@Autowired private AttendanceMapper attendanceMapper;
	
	@Override
	public int attendanceInsert(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceInsert(attendance);
	}

	@Override
	public int attendanceUpdate(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceUpdate(attendance);
	}

	@Override
	public int attendanceDelete(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceDelete(attendance);
	}

	@Override
	public List<Attendance> attendanceList() {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceList();
	}

	@Override
	public Attendance attendanceView(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanceMapper.attendanceView(attendance);
	}

}
