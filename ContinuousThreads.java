package _12_01_2021_MultiThreding;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Iam in MyThread");
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Iam in MyThread1");
				Thread.sleep(1100);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ContinuousThreads extends Thread {
	public static void main(String[] args) {
		MyThread thred = new MyThread();
		MyThread1 thred1 = new MyThread1();
		thred.start();
		thred1.start();

	}

}
