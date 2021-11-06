package io.github.tingreavinash.JavaConcepts.Multithreading;

class Test{
	int i;
	//If synchronized keyword is removed, method will not be thread-safe.
	public synchronized void count() {
		i++;
	}
	
	public void showCount() {
		System.out.println("Count: "+this.i);
	}
}

class BattingStatistics extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("**Batting Thread - " + i);

		}
	}

}

class BowlingStatistics implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("--Bowling Thread - " + i);
		}
	}

}

public class Cricket {

	public static void main(String[] args) throws InterruptedException {
		
		Test obj = new Test();
		Thread t1 = new Thread(()->{
			for (int i=0; i<5000; i++) {
				obj.count();
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i=0; i<5000; i++) {
				obj.count();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		obj.showCount();
		
		BattingStatistics batting = new BattingStatistics();

		//Runnable bowling = new BowlingStatistics();

		Runnable I_bowlingThread = () -> {
			for (int i = 0; i <= 100; i++) {
				System.out.println("--Bowling Thread - " + i);
			}
		};
		Thread bowlingThread = new Thread(I_bowlingThread);

		batting.start();
		bowlingThread.start();
		
		
	}

}
