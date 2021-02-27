package i_api;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,000,000
		Scanner sc = new Scanner(System.in);
		String number = ScanUtil.nextLine();
		String comma = "";
		
		int count = 0;
		for(int i = number.length() - 1; i >= 0; i--){
//			comma += number.charAt(i);
			//comma = comma + number.charAt(i);
			comma = number.charAt(i) + comma;
			
			count++;
			if(count % 3 == 0 && count != number.length()){
				comma = "," + comma;
			}
		}
		System.out.println(comma);
		
	}


}