package sec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	
	public static void main(String[] args) {
		BufferedReader in = null;  //메세지 받기 (입력스트림)
		PrintWriter out = null;    //메세지 보내기 (출력스트림)
		
		Socket socket =null;  //서버 소켓이 필요하지 않음 클라이언트용 소켓만 있으면됨
		Scanner sc = new Scanner(System.in); //메세지 입력스캐너
		
		try {
			socket = new Socket("192.168.20.213",7000); //연결을 하기 위해선 서버의 IP번호와 포트번호를 입력할수있는 요소가 필요 
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out= new PrintWriter(socket.getOutputStream());
			
			while(true) {
			
			System.out.println("메세지 전송하기 >>>");
			String outMsg = sc.next();  //보낼 메세지 작성 
			
			out.println(outMsg); //보낼메세지를 저장하고
			out.flush(); 	//보낼메세지를 발송한다
			if("quit".equalsIgnoreCase(outMsg)) //outMsg.contauns("quit")이라고 써도됨
			 break;
			String inMsg = in.readLine();// in(받은메세지를) 읽는다
			System.out.println("[From server]  : "+inMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("소켓 통신 오류 입니다.");
		}finally {
			if(socket!=null)
				try {
					sc.close();
					socket.close();
					System.out.println("[서벼연결종료]");
				} catch (IOException e) {
					System.out.println("소켓 통신 종료 오류");
					e.printStackTrace();
				}
		}
		
	}

}
