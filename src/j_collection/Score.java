package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		ArrayList<String> subject = new ArrayList();
		ArrayList<String> students = new ArrayList();
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> rank = new ArrayList<>();
		
		
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("Oracle");
		subject.add("Java");
		

		students.add("김건호");
		students.add("김선중");
		students.add("이수훈");
		students.add("오제현");
		students.add("박소영");
		students.add("유동기");
		students.add("김수연");
		students.add("이수정");
		students.add("유승종");
		students.add("김도영");
		students.add("전영헌");
		students.add("김준혁");
		students.add("이건영");
		students.add("송하섭");
		students.add("이예슬");
		students.add("백수진");
		students.add("이연승");
		students.add("최동준");
		students.add("김강영");
		students.add("김우성");
		students.add("황시연");
		students.add("김경찬");
		students.add("김보연");
		students.add("김형석");
		students.add("안용현");
		
		

		for(int i = 0; i < students.size(); i++){
			ArrayList<Integer> li = new ArrayList<>();
			for(int j = 0; j < subject.size(); j++){
				int ran = (int)(Math.random()*101);
				li.add(ran);
			}
			score.add(li);
			
		}
		
		
		for(int i = 0; i < students.size(); i++){
			int sum = 0;
			for(int j = 0; j < subject.size(); j++){
				 sum += score.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum/subject.size()*100 )/ 100.0);
		}
		
		for(int i = 0; i < students.size(); i++){
			rank.add(1);
			for(int j = 0; j < students.size(); j++){
				if(avgs.get(i) > avgs.get(j)){
					rank.set(i, rank.get(i)+1);
				}
			}
		}
		
		
		
		for(int i = 0; i < subject.size(); i++){
			System.out.print("\t" + subject.get(i));
		}
		
		System.out.print("\t합계\t평균\t석차");
		
		
		
		for(int i = 0; i < students.size(); i++){
			System.out.println();
			System.out.print(students.get(i) + "\t");
			for(int j = 0; j < subject.size(); j++){
				System.out.print(score.get(i).get(j) + "\t");
			}
			System.out.print(sums.get(i) + "\t" + avgs.get(i) + "\t" + rank.get(i));
		}
		
		
		
		
		
		
		
	}

}
