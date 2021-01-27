package oopsprograms;

import java.util.Scanner;

public class ShipmentCompany {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Cargo");
		int size = sc.nextInt();
		int[] cargoId = new int[size];
		System.out.println("Enter Cargo Id");
		for (int insert = 0; insert < cargoId.length; insert++) {
			cargoId[insert] = sc.nextInt();

		}
		System.out.println("Ener The number of Shipment");
		int shsize = sc.nextInt();
		System.out.println("Enter Shipment Name");
		String[] shipment = new String[shsize];
		for (int insert = 0; insert < shipment.length; insert++) {
			shipment[insert] = sc.next();

		}
		System.out.println("Enter the CaragoId ");
		int cargo = sc.nextInt();
		int index = findShipment(cargoId, shipment, cargo);
		if (index >= 0) {
			System.out.println(shipment[index]);
		} else {
			System.out.println("Yet to be Shipped");
		}

	}

	private static int findShipment(int[] cargoId, String[] shipment, int cargo) {
		int index = -1;
		for (int check = 0; check < shipment.length; check++) {
			if (cargo == cargoId[check]) {
				index = check;
				return index;
			}
		}
		return index;

	}

}
