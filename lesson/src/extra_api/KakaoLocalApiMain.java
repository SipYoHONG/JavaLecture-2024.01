package extra_api;

public class KakaoLocalApiMain {

	    public static void main(String[] args) {
	        try {
	            // 도로명주소를 입력하세요
	            String address = "경기도 수원시 인계동";
	            
	            // KakaoLocalApi 인스턴스 생성
	            KakaoLocalApi kakaoApi = new KakaoLocalApi();
	            
	            // getGeocode 메소드 호출
	            kakaoApi.getGeocode(address);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}