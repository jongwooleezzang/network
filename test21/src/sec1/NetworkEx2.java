package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;
//파일 ,데이터베이스,네트워크 등은 외부자원 으로서 반드시 반드시 try/catch 처리해야한다ㅏ
public class NetworkEx2 {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();//현재컴퓨터
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			InetAddress[] iArr =InetAddress.getAllByName("www.naver.com");//네이버 지역컴퓨터
			for(InetAddress addr: iArr) {
				System.out.println(addr.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}