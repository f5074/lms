package lms.lms.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lms.lms.attendance.service.AttendanceService;
import lms.lms.common.domain.Attendance;
import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndroidController {
	@Autowired
	private UserDetailService userDetailService;
	@Autowired
	private AttendanceService attendanceService;

	// 안드로이드로 휴대폰뒷자리4자리 받고 입실데이터 받기
	@RequestMapping("/android3")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse(
			HttpServletRequest request) {

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int userPhone = Integer.parseInt(request.getParameter("userPhone"));

		List<UserDetail> userDetail = userDetailService.sendSMS(userNo,
				userPhone);

		Map<String, String> result = new HashMap<String, String>();

		for (int i = 0; i < userDetail.size(); i++) {
			System.out.println(i + " : " + userDetail.get(i).getUserPhone());
		}

		result.put("data1", String.valueOf(userDetail.get(0).getUserNo()));
		result.put("data2", userDetail.get(0).getUserName());
		result.put("data3", userDetail.get(0).getUserPhone());
		/* result.put("data4", userDetail.get(0).getUserParentPhone()); */

		return result;
	}

	// 안드로이드로 입실데이터 받고 입실 시키기
	@RequestMapping("/android4")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse2(
			HttpServletRequest request) {

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		/* int userPhone = Integer.parseInt(request.getParameter("userPhone")); */

		// 입실 입력 후 입실시간 입력
		attendanceService.checkInTime(userNo);

		// 입실한 정보 가져오기
		List<Attendance> checkInSMS2 = attendanceService.checkInSMS2(userNo);

		Map<String, String> result = new HashMap<String, String>();

		for (int i = 0; i < checkInSMS2.size(); i++) {
			System.out.println(i + " : " + checkInSMS2.get(i).getUserNo());
		}

		result.put("data1", String.valueOf(checkInSMS2.get(0).getUserNo()));
		result.put("data2", checkInSMS2.get(0).getCheckInSMS());

		return result;
	}

	// 안드로이드로 퇴실데이터 받고 퇴실 시키기
	@RequestMapping("/android5")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse3(
			HttpServletRequest request) {

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		/* int userPhone = Integer.parseInt(request.getParameter("userPhone")); */

		// 퇴실 입력 후 퇴실시간 입력
		attendanceService.checkOutTime(userNo);

		// 퇴실한 정보 가져오기
		List<Attendance> checkOutSMS2 = attendanceService.checkOutSMS2(userNo);

		Map<String, String> result = new HashMap<String, String>();

		for (int i = 0; i < checkOutSMS2.size(); i++) {
			System.out.println(i + " : " + checkOutSMS2.get(i).getUserNo());
		}

		result.put("data1", String.valueOf(checkOutSMS2.get(0).getUserNo()));
		result.put("data2", checkOutSMS2.get(0).getCheckOutSMS());

		return result;
	}

	// 안드로이드로 입실 기록에서 문자를 확인하고 문자 보내기
	@RequestMapping("/android6")
	@ResponseBody
	public Map<String, String> androidTestWithRequestAndResponse4(
			HttpServletRequest request) {

		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int userPhone = Integer.parseInt(request.getParameter("userPhone"));
		String CheckInTime, CheckOutTime;


		// 입실한 정보 가져오기
		List<Attendance> checkInSMS2 = attendanceService.checkInSMS2(userNo);
		Map<String, String> result = new HashMap<String, String>();
		boolean a = checkInSMS2.isEmpty();
		

		if (a == false) {

			userNo = Integer.parseInt(String.valueOf(checkInSMS2.get(0)
					.getUserNo()));
			CheckInTime = checkInSMS2.get(0).getCheckInTime();

			List<UserDetail> userDetailList = userDetailService.userDetailView(
					userNo, userPhone);

			
			result.put("data1",
					String.valueOf(userDetailList.get(0).getUserParentPhone()));

			result.put("data2", "참 좋은 독서실: "
					+ userDetailList.get(0).getUserName() + "(이)가 "
					+ CheckInTime + "에 입실하였습니다.");

			// 입실문자체크가 0일때 1로 변경
			attendanceService.checkInSMS(userNo);

		} else {

			// 퇴실한 정보 가져오기
			List<Attendance> checkOutSMS2 = attendanceService.checkOutSMS2(userNo);
			
			boolean b = checkOutSMS2.isEmpty();

			
			if(b==true){
				
				userNo = 4;
				CheckOutTime = "스레드멈춤방지";
				
			} else{
				userNo = Integer.parseInt(String.valueOf(checkOutSMS2.get(0)
						.getUserNo()));

				// 데이트 객체에서 시간 나오게 하기
				CheckOutTime = checkOutSMS2.get(0).getCheckOutTime();
			}
				List<UserDetail> userDetailList = userDetailService.userDetailView(
						userNo, userPhone);
			
				result.put("data1",
						String.valueOf(userDetailList.get(0).getUserParentPhone()));

				result.put("data2", "참 좋은 독서실: "
						+ userDetailList.get(0).getUserName() + "(이)가 "
						+ CheckOutTime + "에 퇴실하였습니다.");

				// 퇴실문자체크가 0일때 1로 변경
				attendanceService.checkOutSMS(userNo);				

		}

		return result;
	}

}
