package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요~");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("두번째 숫자를 입력해주세요~");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("연산자를 입력해주세요~");
		String operator = sc.nextLine();
		

		System.out.println(operator.equals("+") ? num1 + num2 : operator.equals("-")?num1 - num2 : operator.equals("*")?
			 num1 * num2 : operator.equals("/") ? num1 / num2 : operator.equals("%") ? num1 % num2 : "연산자가 잘못되어습니다!!");  
		
		
	}

}
