package _12_01_2021_MultiThreding;

import java.util.Set;

public class PrintAllThreds extends Thread {

	@Override
	public void run() {
		mehtod1();

	}

	private static void method2() {
		System.out.println("thread in method2 :" + Thread.currentThread().getName());
	}

	private static void mehtod1() {
		System.out.println("thread in method1 :" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		System.out.println("thread in main :" + Thread.currentThread().getName());
		PrintAllThreds t1 = new PrintAllThreds();
		PrintAllThreds t2 = new PrintAllThreds();
		t1.start();
		t2.start();
		method2();

		// to print All Threads running in current program
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		for (Thread thread : threadSet) {

			System.out.println(thread);
		}

	}

}
