package lms.lms.attendance.dao.mapper;

import java.util.List;

import lms.lms.common.domain.Attendance;

public interface AttendanceMapper {
	int attendanceInsert(Attendance attendance);
	int attendanceUpdate(Attendance attendance);
	int attendanceDelete(Attendance attendance);
	List<Attendance> attendanceList();
	Attendance attendanceView(Attendance attendance);

}
