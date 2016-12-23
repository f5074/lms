package lms.lms.attendance.service;

import java.util.List;

import lms.lms.common.domain.Attendance;

public interface AttendanceService {

	int attendanceInsert(Attendance attendance);
	int attendanceUpdate(Attendance attendance);
	int attendanceDelete(Attendance attendance);
	List<Attendance> attendanceList();
	Attendance attendanceView(Attendance attendance);
}