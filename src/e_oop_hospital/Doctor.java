package e_oop_hospital;

public class Doctor {

	public static void main(String[] args) {
		Nurse n = new Nurse();
		String receipt = n.receipt();
		System.out.println(receipt);
		
		System.out.println("진료중~");
		String prescription = "처방전";
		
		n.diagnosis(prescription);
		
		n.acceptance(receipt);

	}

}
