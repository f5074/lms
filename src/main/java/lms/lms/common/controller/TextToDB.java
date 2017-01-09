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
				String[] txtArr = source.split("\\|") ;
					System.out.println("01_"+txtArr[0]);
					System.out.println("02_"+txtArr[1]);
					System.out.println("03_"+txtArr[2]);
					System.out.println("04_"+txtArr[3]);
					System.out.println("05_"+txtArr[4]);
					System.out.println("06_"+txtArr[5]);
					System.out.println("07_"+txtArr[6]);
					System.out.println("08_"+txtArr[7]);
					System.out.println("09_"+txtArr[8]);
					System.out.println("10_"+txtArr[9]);
					System.out.println("11_"+txtArr[10]);
					System.out.println("12_"+txtArr[11]);
					System.out.println("13_"+txtArr[12]);
					System.out.println("14_"+txtArr[13]);
					System.out.println("15_"+txtArr[14]);
					System.out.println("16_"+txtArr[15]);
					System.out.println("17_"+txtArr[16]);
					System.out.println("18_"+txtArr[17]);
					System.out.println("19_"+txtArr[18]);
					System.out.println("20_"+txtArr[19]);
					System.out.println("21_"+txtArr[20]);
					System.out.println("22_"+txtArr[21]);
					System.out.println("23_"+txtArr[22]);
					System.out.println("24_"+txtArr[23]);
					System.out.println("25_"+txtArr[24]);
					System.out.println("26_"+txtArr[25]);
					System.out.println("27_"+txtArr[26]);
					System.out.println("28_"+txtArr[27]);
					System.out.println("29_"+txtArr[28]);
			}
			br.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
