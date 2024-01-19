package ch06_class.sec06_Interpark;

public class InterparkMain {

	public static void main(String[] args) {
        Interpark[] interparks = {
            new Interpark(1, "주식 투자 초보를 위한 단타 전략", "홍인기", null, "길벗", 18900),
            new Interpark(2, "40세에 쇼펜하우어 읽기", "강용수", null, "유노북스", 15300),
            new Interpark(3, "세이노의 가르침", "세이노", null, "데이원", 6480),
            new Interpark(4, "이런 작은 것들", "클레어 키건", "홍한별", "다산서가", 12420),
            new Interpark(5, "죽음이 묻었다, 너는 어떻게 살 것인가?", "할터 한스", "윤진한", "포레스트 북스", 16020)
        };

        for (Interpark interpark : interparks) {
            System.out.println(interpark.toString());
        }
    }
}
