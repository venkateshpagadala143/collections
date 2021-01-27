
package oopsprograms;

import java.util.Scanner;

public class PortRoute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size  of ports ");
		int size = sc.nextInt();
		System.out.println("Enter ports");
		int[][] ports = new int[size][size];
		for (int index = 0; index < ports.length; index++) {
			for (int insert = 0; insert < ports.length; insert++) {
				ports[index][insert] = sc.nextInt();
			}
		}
		System.out.println("Enter two port numbers A and B");
		int portA = sc.nextInt();
		int portB = sc.nextInt();
		if(ports[portA-1][portB-1]==0) {
			System.out.println("There is no route");
		}else {
			System.out.println("There is a route");
		}
	}

}
