package e_oop;

public class AirConditioner {
	boolean power;
	int temperature;
	
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 16;
	
	AirConditioner() {
		power = false;
		temperature = 25;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "에어컨 켜짐" : "에어컨 꺼짐");
	}
	
	void changeTemperature(int temperature){
		if(power){
			if(temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE){
				this.temperature = temperature;
			}
			System.out.println("현재온도 : " + this.temperature);
		}
		
	}
	
	void upTemperature(){
		changeTemperature(temperature+1);
	}
	
	void downTemperature(){
		changeTemperature(temperature-1);
	}
	
	
	public static void main(String[] args) {
		AirConditioner air = new AirConditioner();
		
		while(true){
			System.out.println("1.전원   2.온도업  3.온도다운  0.종료");
			int input = ScanUtil.nextInt();
			switch(input){
			case 1: air.power(); break;
			case 2: air.upTemperature(); break;
			case 3: air.downTemperature(); break;
			
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
