package sec1;
import java.io.FileOutputStream;
import java.io.IOException;

//OutputStreamWriter osw = null; 객체를 생성하지 않고 for문을 살리면서 정상적으로 안녕하세요!가 출력되게 인코딩하는 방법
public class IOService3 {
public static void main(String[] args) {
     output1();
    }

//length() 메서드는 String 클래스의 메서드이므로 이것은 배열에서 사용할 수 없습니다. 따라서 배열이 아닌 객체나 변수에서는 length 속성을 사용할 수 없습니다.
 public static void output1() {
     FileOutputStream fos = null;
     try {
         fos = new FileOutputStream("test111111.txt");
         String str = "안녕하세요!";
         byte[] utf8Bytes = str.getBytes("UTF-8"); // UTF-8로 인코딩된 바이트 배열 생성
         for (int i = 0; i < utf8Bytes.length; i++) {
             fos.write(utf8Bytes[i]); // 파일에 각 바이트 쓰기
         }
     } catch (IOException e) {
         e.printStackTrace();
     } finally {
         try {
             if (fos != null)
                 fos.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
}