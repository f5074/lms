package com.lms.attendance.dao;

import java.util.List;

import com.lms.domain.Attendance;

public interface AttendanceDao {

	int attendanceInsert(Attendance attendance);
	int attendanceUpdate(Attendance attendance);
	int attendanceDelete(Attendance attendance);
	List<Attendance> attendanceList();
	Attendance attendanceView(Attendance attendance);
}
