package sec1;

public class SystemEx {

	public static void main(String[] args) {
		//만약, 자바 공급자의 정보를 출력한다면,
		String vendor = System.getProperty("java.vendor");
		System.out.println("자바 공급자의 정보 : " +vendor);
		
		//현재 자바 설치 버전 출력 (java.version) 출력
		String version = System.getProperty("java.version");
		System.out.println("자바 설치버전 정보 : " +version);
		
		//자바 클래스 경로 출력 (java.class.path)출력
		String CP = System.getProperty("java.class.path");
		System.out.println("자바 클래스 경로 정보 : " +CP);
		//운영체제 이름(os.name)출력
		String os = System.getProperty("os.name");
		System.out.println("운영체제 이름 정보 : " +os);
		//사용자 계정(user.name)출력
		String uname = System.getProperty("user.name");
		System.out.println("사용자 계정 정보 : " +uname);
		//현재 디렉토리 (user.dir)출력
		String Dr = System.getProperty("user.dir");
		System.out.println("현재 디렉토리 정보 : " +Dr);
	
		
	
	}

}
