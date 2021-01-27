package _13_01_2021_oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShipmentDeatails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Shipments");
		int size = sc.nextInt();
		List<Shipment> ship = new ArrayList<>();
		for (int insert = 1; insert <= size; insert++) {
			System.out.println("Enter the Shipment " + insert + " Deatails");
			System.out.println("Enter the Shippment Name");
			String shipperName = sc.next();
			System.out.println("Enter the ModeOf Transporatation");
			String modeOfTransportation = sc.next();
			System.out.println("Enter the totalWeight");
			Float totalWeight = sc.nextFloat();
			System.out.println("Enter the arrivalport");
			String arrivalPort = sc.next();
			System.out.println("Enter the ModeOf depatureport");
			String departurePort = sc.next();
			Shipment shipment = Shipment.createNewShipment(Shipment.nextShipmentId+insert, shipperName, modeOfTransportation,
					totalWeight, arrivalPort, departurePort);

			ship.add(shipment);
		}
		System.out.println(
				"Id         Shippername    Mode of transportation     Total weight   Arrival port   Departure port");
		for (Shipment shipment : ship) {
			System.out.println(shipment);
		}
	}

}
