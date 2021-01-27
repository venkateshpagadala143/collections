package _13_01_2021_oops;

public class Shipment {

	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private Float totalweight;
	private String arrivalPort;
	private String departurePort;
 static int nextShipmentId = 1000;

	public Shipment(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort,
			String departurePort) {
		super();
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalweight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	public Shipment() {

	}

	@Override
	public String toString() {
		return String.format("%-15d%-15s%-25s%-15s%-20s%s", this.id, this.shipperName, this.modeOfTransportation,
				this.totalweight.toString() + "Kg", this.arrivalPort, this.departurePort);// to format the string.

	}

	public static Shipment createNewShipment(int id, String shipperName, String modeOfTransportation, Float totalWeight,
			String arrivalPort, String departurePort) {
		Shipment sh = new Shipment(id, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
		return sh;
	}

}
