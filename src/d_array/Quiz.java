package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1();  //거스름돈의 동전 개수
		
//		quiz2();  //그래프 그리기
		
//		quiz3();  //같은 숫자는 싫어
		
		quiz4();  //나누어 떨어지는 숫자 배열
		

	}

	private static void quiz4() {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int number = (int)(Math.random() * 4 + 2);
		
		int[] temp = new int[100];
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % number == 0){
				temp[count++] = arr[i];
			}
		}
		System.out.println(number);
		arr = new int[count];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = temp[i];
		}
		
		for(int i = 0; i < arr.length-1; i++){
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;

		}
		System.out.println("number : " + number);
		System.out.println(Arrays.toString(temp));
		
		}
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이러우진 배열을 정렬하여 출력해주세요
		 * 랜덤수 5
		 * 100개를 5로 나누어서 나누어떨어지는 숫자만 나오도록 그리고 정렬까지 
		 * [5, 10, 15, 15, 20, 25]
		 */
	

	private static void quiz3() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1 ~ 5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [1, 3, 3, 2, 1, 4, 5, 5, 1, 3]
		 * [1, 3, 2, 4, 5]
		 */
		// * i j
		 /*  1,0
		  *  2,0 2,1
		  *  3,0 3,1 3,2
		  *  4,0 4,1 4,2 4,3
		  *  ....
		  *  9,0 9,1.......9,8 
		 */
		int arr1[] = new int[10];
		arr1[0] = arr[0];
		for(int i = 1; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				if(arr[i] == arr1[j]){
					arr1[i] = 0; break;
				}else{
					arr1[i] = arr[i];
				}
				
			}
		}
		System.out.println(Arrays.toString(arr1));
////////		int count = 0;
////////		for(int i = 0; i < arr.length; i++){
////////			if(arr[i] == 0){
////////				count++;
////////			}
////////		}
//////		
//		int[] result = new int[count];
//		
//		count = 0;
//		for(int i = 0; i < arr.length; i++){
//			if(arr[i] != 0 ){
//				result[count++] = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(result));
//		
	}
		/*
		 * [1, 3, 3, 2, 1, 4, 5, 5, 1, 3]
		 * [1, 3, 2, 4, 5]
		 */
		
//		int[] temp = new int[5];
//		int count = 0;
//		for(int i = 0; i < arr.length; i++){
//			boolean flag = false;
//			for(int j = 0; j < temp.length; j++){
//				if(arr[i] == temp[j]){
//					flag = true;
//				}
//			}
//			if(!flag){
//				temp[count++] = arr[i];
//			}
//		}
//		
//		System.out.println(Arrays.toString(temp));
//		
//		int[] result = new int[count];
//		for(int i = 0; i < result.length; i++){
//			result[i] = temp[i];
//		}
//		System.out.println(Arrays.toString(result));
//		
		
//}	

	private static void quiz2() {
		int[] arr = new int[20];
		for(int i = 1; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
//		int[] count = new int[5];
//		for(int i = 0; i < arr.length; i++){
//			count[arr[i] - 1]++;
//		}
//		
//		for(int i = 0; i < count.length; i++){
//			System.out.print(i + 1 + " : ");
//			for(int j = 0; j < count[i]; j++){
//				System.out.print("*");
//			}
//			System.out.println(" " + count[i]);
//		}
//		
		int count[] = new int[]{1,2,3,4,5};
		for(int i = 0; i < count.length; i++){
			System.out.print(count[i] + ":" + " ");
			int num=0;
			for(int j = 0; j < arr.length; j++){
				if(arr[j]==i+1){
					System.out.print("*");
					num++;
				}
					
			}
			System.out.print(" " + num );
			System.out.println();
		}
		
		/*
		 * 1 ~ 5의 숫자가 발생된 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2
		 * 4 : ***** 5
		 * 5 : * 1
		 */
	}

	private static void quiz1() {
		int money = (int)(Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };
		System.out.println("거스름돈 : " + money);
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		for (int i = 0; i < coin.length; i++) {
			int count = money / coin[i];
			System.out.println(coin[i] + "원 : " + count + "개");
			money %= coin[i];
		}

	}

}
