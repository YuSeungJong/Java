package e_oop_hospital;

public class Nurse {
	
	//환자접수 
	String receipt(){
		System.out.println("어디가 아프세요? ");
		return "감기걸렸어요~";
	}
	
	//진료
	void diagnosis(String str){
		System.out.println("처방전 받으세요~");
	}
	
	void acceptance(String str){
		System.out.println("진료비 2만원입니다.");
	}
	
}
