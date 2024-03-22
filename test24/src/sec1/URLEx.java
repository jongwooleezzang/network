package sec1;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException {
		URL Faker =new URL("https://www.youtube.com/watch?v=abxpNFF9qqY");
		System.out.println("프로토콜 종류 :"+Faker.getProtocol());
		System.out.println("포트번호 : "+Faker.getPort());
		System.out.println("호스트 이름 : "+Faker.getHost());
		System.out.println("파일(경로포함) : "+Faker.getFile());
		System.out.println("전체 URL : "+Faker.toExternalForm());
		
	}
}
