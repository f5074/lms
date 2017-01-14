package lms.lms.common.controller;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TextToDB {

	public static void main(String[] args) {
		
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
					System.out.println("01_"+txtArr[0]);
					System.out.println("02_"+txtArr[1]);
					System.out.println("03_"+txtArr[2]);
					System.out.println("04_"+txtArr[3]);
					System.out.println("05_"+txtArr[4]);
					System.out.println("06_"+txtArr[5]);
					System.out.println("07_"+txtArr[6]);
					System.out.println("08_"+txtArr[7]);
					

			}
			br.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
