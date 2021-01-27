package _12_01_2021_MultiThreding;

class FabonacciThread extends Thread {
	@Override
	public void run() {
		int first = 0;
		int second = 1;
		int sum;
		System.out.println("The Fabonaci is : " + first + "\n" + "The Fabonaci is : " + second);
		for (int index = 2; index <= 10; index++) {
			sum = first + second;
			System.out.println("The Fabonaci is :" + sum);
			first = second;
			second = sum;

		}

	}

}

class DecendingIntThread extends Thread {
	@Override
	public void run() {
		for (int print = 10; print > 0; print--) {
			System.out.println("decendund numbers is :" + print);

		}
	}

}

public class FabonacciUsingThreaads {

	public static void main(String[] args) {
		FabonacciThread ft = new FabonacciThread();
		DecendingIntThread dt = new DecendingIntThread();
		ft.start();
		dt.start();

	}

}