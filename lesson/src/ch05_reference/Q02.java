package ch05_reference;

public class Q02 {

	public static void main(String[] args) {
		int duration = 0;
		for (int hour = 0; hour <= 23; hour++) {
			for(int minute = 0; minute <= 59; minute++) {
				String timeStr = hour + ":" + minute;
				if(timeStr.indexOf("3") >= 0)
				duration += 60;
			}
		}
		
		System.out.println(duration);
		}
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int displayTime = 0;
//		
//		for(int hour = 0; hour <= 23; hour++) {
//			for (int minute = 0; minute <= 59; minute++) {
//				if((hour % 10 == 3) || (minute % 10 == 3) ||(minute / 10 == 3)) {
//					displayTime += 60;	
//				}
//			}
//		}
//		System.out.println("하루동안 3이 표시되는 시간은" + displayTime + "초 입니다.");
	
