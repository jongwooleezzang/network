package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx3 {

	public static void main(String[] args) {
		//본인 컴퓨터의 ip주소와 컴퓨터 이름 출력
		
		//www.google.com 의 연결 IP주소를 출력하기
		try {
			InetAddress a=InetAddress.getLocalHost();
			System.out.println("본인컴퓨터 IP주소 : "+a.getHostAddress());//내컴퓨터 ip주소
			System.out.println("네트워크상의 컴퓨터 이름 :"+a.getHostName());//내컴퓨터 이름
			InetAddress[] iArr =InetAddress.getAllByName("www.google.com");
			
			for(InetAddress addr : iArr) {
				System.out.println("구글의 IP주소 : "+addr.getHostAddress());//구글ip 주소
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
