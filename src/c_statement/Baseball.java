package c_statement;

import java.util.Scanner;

public class Baseball {

   public static void main(String[] args) {
      /*
       * 135
       * 123 : 1S(스트라이크) 1B(볼) 1O(아웃)
       * 345 : 1S(스트라이크) 1B(볼) 1O(아웃)
       * 159 : 1S(스트라이크) 0B(볼) 2O(아웃)
       * 
       * 
       * 135
       * 123 : 1S 1B 1O
       * 345 : 1S 1B 2O
       * 147 : 1S 0B 2O
       */
      //숫자야구 게임을 만들어주세요.
   
      int number = (int)(Math.random() * 900) + 100;     //100 <= number <1000
      int input = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println(number);
      do{
    	 int strike = 0;
         int ball = 0;
         int out = 0;
         
         System.out.println("세자리 숫자를 입력해주세요~~");
         input = Integer.parseInt(sc.nextLine());
         
         if(number/100 == input/100 ) strike++;
         if((number%100)/10 == (input%100)/10) strike++;
         if((number%100)%10 ==  (input%100)%10) strike++;
         
         if(number/100 == (input%100)/10 || number/100 == (input%100)%10) ball++;
         if((number%100)/10 == input/100 || (number%100)/10 == (input%100)%10) ball++;
         if((number%100)%10 == input/100 || (number%100)%10 == (input%100)/10) ball++;
         
         if(number/100 != input/100 && number/100 != (input%100)/10 && number/100!= (input%100)%10) out++;
         if((number%100)/10 != input/100 && (number%100)/10 != (input%100)/10 && (number%100)/10 != (input%100)%10) out++;
         if((number%100)%10 != input/100 && (number%100)%10 != (input%100)/10 && (number%100)%10 != (input%100)%10) out++;
         
         System.out.println(strike + "스트라이크!" + ball + "볼~" + out + "아웃");
      }
      while(number != input);
      System.out.println("수고하셨습니다!!");
      
   }

}







