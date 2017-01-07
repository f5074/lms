package lms.lms.attendance.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lms.lms.common.domain.Attendance;

public interface AttendanceMapper {
	
	//출결 리스트 출력
	List<Attendance> attendanceList();
	
	//입실 시 시간 추가
	int checkInTime(int userNo);
	//입실 시 오늘 입실 여부 확인
	List<Attendance> checkInTime2(int userNo);
	
	//입실시 유저의 체크인sms 1로 변경
	int checkInSMS(int userNo);	
	//체크인 후 입실한 유저의 데이터 보내기
	List<Attendance> checkInSMS2(@Param("userNo")int userNo);

	
	
	//퇴실 시 시간 추가
	int checkOutTime(int userNo);
	//퇴실 시 오늘 퇴실 여부 확인
	List<Attendance> checkOutTime2(int userNo);
	
	
	
	//퇴실시 유저의 체크아웃sms 1로 변경
	int checkOutSMS(int userNo);	
	//체크아웃 후 퇴실한 유저의 데이터 보내기
	List<Attendance> checkOutSMS2(@Param("userNo")int userNo);

}
