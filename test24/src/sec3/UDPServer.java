package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket socket =null;
		DatagramPacket packet =null;
		int port = 7000;
		try {
			socket = new DatagramSocket(port);
			while(true) {
					byte[] buffer =  new byte[512];
					packet = new DatagramPacket(buffer, buffer.length);
					System.out.println("ready");
					socket.receive(packet); //실린 수신데이터 받기 
					String rData = new String(packet.getData()); //패킷(byte) 데이터 =String으로  형 변환
					System.out.println("수신 데이터 : " +rData);
					
					InetAddress ip = packet.getAddress();
					port = packet.getPort();
					System.out.println("[Client IP Address] : "+ip);
					System.out.println("[Client port :"+port );
					
					packet = new DatagramPacket(packet.getData(), packet.getLength(),ip,port);
					socket.send(packet);  //송신 데이터 패킷 실어보내기 
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
