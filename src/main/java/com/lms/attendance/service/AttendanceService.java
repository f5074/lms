package com.lms.attendance.service;

import java.util.List;

import com.lms.domain.Attendance;

public interface AttendanceService {

	int attendanceInsert(Attendance attendance);
	int attendanceUpdate(Attendance attendance);
	int attendanceDelete(Attendance attendance);
	List<Attendance> attendanceList();
	Attendance attendanceView(Attendance attendance);
}
