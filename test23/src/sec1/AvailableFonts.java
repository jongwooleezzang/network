package sec1;

import java.awt.GraphicsEnvironment;

public class AvailableFonts {
    public static void main(String[] args) {
        // 시스템의 그래픽 환경 정보 가져오기
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // 사용 가능한 폰트 목록 가져오기
        String[] fontNames = ge.getAvailableFontFamilyNames();

        // 사용 가능한 폰트 목록 출력
        System.out.println("Available Fonts:");
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}