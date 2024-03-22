package sec1;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOService {
	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileOutputStream fos = null;//원인1.전송에 적합하지않은 클래스사용FileOutputStream 는 바이트 단위의 전송이므로 문자열인 안녕하세요는 손상되어 나타난다.
		try {
			fos = new FileOutputStream("test.txt"); //11행과 13행은FileOutputStream => FileWriter 클래스로 교체한다 
			String str ="안녕하세요!";
	   	for(int i=0 ; i <str.length() ; i++) {
				fos.write(str.charAt(i)); //charAt 은 바이트 당
			}   
		}catch(IOException e){
			e.printStackTrace();
		}finally {//예외 발생 유무와는 관계없이 사용한 자원은 반드시 반환해야하므로 반환의무를 위배한 결과를 초래함 (파일을 열었으면 닫아야함)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

