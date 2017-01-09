package lms.lms.common.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lms.lms.common.domain.UserDetail;
import lms.lms.userDetail.service.UserDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TextToDBController {
	@Autowired private UserDetailService userDetailService;
	
	@RequestMapping("/textToDB")
	@ResponseBody
	public int textToDBInsert(UserDetail userDetail){
		int result = 0;

		String file = "D:\\aa.txt";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(file),"euc-kr")
					);
			String data ="";
			while ((data=br.readLine()) != null ){			
				String source = data;
				String[] txtArr = source.split("\\ ") ;

				userDetail.setUserName(txtArr[4]);
				userDetail.setUserPhone(txtArr[7]);
				result = userDetailService.userDetailInsert(userDetail);
			}
			br.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
		return result;
		
	}
	

}
