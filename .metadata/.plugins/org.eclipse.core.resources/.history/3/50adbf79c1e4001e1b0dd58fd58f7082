package sec2;

import java.awt.Toolkit;


//Thread(쓰레드) = Process(프로세스) = 현재 컴퓨터에서 실행중인 프로그램(작업)
//발생(new) =>실행대기:RUNNABLE => 점유 => 실행대기 => 기동 =>종료
//실행 =>실행대기 : sleep 
//실행대기 => 실행: wake up(run)
public class ThreadEx1 {
	public static void firstThread() {
		System.out.println("첫번째 쓰레드");
	}
	public static void secondaryThread() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<=10 ;i++) { //0~9까지 카운트 작업
					System.out.println(i);
			try {
					Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
			
		Thread thread2 = new Thread(new Runnable() {//new Thread(생성) => Runnable(실행대기)
			@Override
			public void run() {
				secondaryThread();
			}
		});
		thread2.start();
		
	
		
		

	}

}
