package sec1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class IOService2 {
    public static void main(String[] args) {
        output1();
    }

    public static void output1() {
        try (FileOutputStream fos = new FileOutputStream("test123.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8")) {
            String str = "안녕하세요!";
            osw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}