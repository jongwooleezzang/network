package sec6;
import java.io.BufferedReader;
/*
 문제6. TCP 소켓을 사용하여 아래의 요구사항에 맞게 클라이언트에서 서버로 연결 처리하는 네트워크 프로그램을 구동하였으나 서버와 연결이 되지 않았다. 
문제점이 있는 코드를 찾아 [원인](50점)에 파악된 문제점을 기술하고, 해결 방안을 구상하여 [조치내용](50점)에 해결방법을 작성하여 보고서를 완성하시오. (100점)

- 서버 IP : 127.0.0.1, 포트번호 : 3000
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		int port = 3000;
		try {
			socket = new Socket(port); //포트와 ip 번호가 다들어가야된다 ip번호 누락
			if(socket != null) {
				System.out.println("[Client]");
				System.out.println("서버와 연결 성공!");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			// 이하 코드는 중간 생략..

						}
					}
				}
			}
	}

}
