package ch06_class.sec05_Melon;

public class MelonArrayMain {
	

	public static void main(String[] args) {
		Melonchart[] meloncharts = new Melonchart[5];
        meloncharts[0] = new Melonchart(1,"비의 랩소드", "임재현", "비의 랩소드", 33194);
        meloncharts[1] = new Melonchart(2,"To.X", "태연", "To. X-The 5th Mini Album", 82784);
        meloncharts[2] = new Melonchart(3, "Perfect Night", "르세라핌", "Perfect Night", 94989);
        meloncharts[3] = new Melonchart(4, "Drama", "aespa", "Drama - The 4th Mini Album", 68534);
        meloncharts[4] = new Melonchart(5, "에피소드", "이무진", "에피소드", 33230);		
	
        for (Melonchart melonchart: meloncharts)
        	System.out.println(melonchart);
        
	}
	
}
