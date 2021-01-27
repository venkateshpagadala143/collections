package _13_01_2021_oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayPortDeatails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Ports");
		int size = sc.nextInt();
		List<Port> list = new ArrayList<>();
		for (int index = 1; index <= size; index++) {
			System.out.println("Enter Port  " + index + "details");
			int portNumber = sc.nextInt();
			String name = sc.next();
			System.out.println("Is the Port from the same country [y/n]");

			String option = sc.next();
			if (option.charAt(0) == 'y' || option.charAt(0) == 'Y') {
				Port port = new Port(portNumber, name, "India");
				list.add(port);
			} else if (option.charAt(0) == 'n' || option.charAt(0) == 'N') {
				System.out.println("Enter the Country");
				String country = sc.next();
				Port port = new Port(portNumber, name, country);
				list.add(port);
				
			}else {
				System.out.println("Enter a valid Option");
			}
		}
		System.out.println("Id               Name         Country");
		for (Port port : list) {
			System.out.println(port);
		}
	}
}
