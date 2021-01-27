package oopsprograms;

import java.util.Scanner;

public class NearestPorts {
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
		findnearestRoutes(ports);
	}

	private static void findnearestRoutes(int[][] ports) {
		for (int index = 0; index < ports.length; index++) {
			int min = 10;
			int indexValue = -1;
			for (int check = 0; check < ports.length; check++) {
				if (min >= ports[index][check] && ports[index][check] != 0) {
					min = ports[index][check];
					indexValue = check;
				}
			}
			if (indexValue >= 0) {
				System.out.println("Port " + index+1 + " is Closer to Port " + indexValue+1);

			} else {
				System.out.println("No Ports are Closer to Port " + index+1);
			}

		}

	}

}
