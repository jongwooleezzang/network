package sec4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
문제 4. TCP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 네트워크 프로그램을 구동하였으나 서버와 연결이 되지 않았다. 문제점이 있는 코드를 찾아 
[원인](20점)에 파악된 문제점을 기술하고, 해결된 코드를 [조치내용](20점)에 해결방법을 작성하여 보고서를 완성하시오. (40점)

- 서버 IP : 각자 IP 주소, 포트번호 : 3000

[서버용 프로그래밍 코드]
코드는 Test4-1.png

[클라이언트용 프로그래밍 코드]
코드는 Test4-2.png
*/
public class Server {

	public static void main(String[] args) {
		try {
		   ServerSocket	server = new ServerSocket();//서버소캣은 서버가 지정되지않아 통신을할수없다."3000"을 넣는다new ServerSocket("3000");
			Socket s = server.accept();
		}
	}
}
