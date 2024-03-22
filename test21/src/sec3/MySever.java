package sec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class MySever {
	public static void main(String[] args) {
			BufferedReader in = null; //읽는 스트림(입력)
			PrintWriter out = null; //쓰기 스트림 (출력)
			
			ServerSocket server =null; //서버용소켓
			Socket socket = null;  //클라이언트용 소켓
			
			Scanner sc = new Scanner(System.in);
			
		try {
		  server = new ServerSocket(7000); //소켓의 열림닫힘을 확인하기위해 try/catch  특정포트번호로 서버가 시작
		  System.out.println("[Server 실행] : Client 연결 대기중 입니다.");
		  socket = server.accept();   //클라이언트 연결 가능한 상태를 만들어주는것 (연결대기로 만들어줌)
		  System.out.println("[Client 연결대기상태 ]");
		  in = new BufferedReader(new InputStreamReader(socket.getInputStream()/*소켓에들어온메세지*/));
		  out= new PrintWriter(socket.getOutputStream());
		  
		  while(true) {
			  //수신
			  String inMsg = in.readLine(); //클라이언트로 부터온 메세지를 읽어낸다
			  System.out.println("[From Client :]"+inMsg);
			  
			  //발신
			  System.out.println("전송 >>>");
			  String outMsg = sc.next(); //클라이언트로 메세지를 스캐너로 입력하여 내보넨다
			  out.println(outMsg); //송신객체에 메세지 저장
			  out.flush();    //클러이언트에게 송신 메세지 전달
			  
			  if("quit".equalsIgnoreCase(inMsg))//inMsg 가 quit와 같다면  브레이크(와일문을빠져서나가 종료)
				  break;
			  
			  if("quit".equalsIgnoreCase(outMsg)) //outMsg가 quit와 같다면 브레이크 
				  break;
		  }
		} catch (IOException e) {
			e.printStackTrace();
		}
		  finally {
				sc.close();
				try {
					socket.close();
					server.close();
					System.out.println("연결종료");
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("소켓 연결 종료 오류");
				}
		  }
		
	}
		
}

