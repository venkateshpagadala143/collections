package oopsprograms;

import java.util.Scanner;

public class Ports {
	private int cityId;
	private String cityName;
	private int railTransportation;
	private int roadTransportation;
	private int airTransportation;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getRailTransportation() {
		return railTransportation;
	}

	public void setRailTransportation(int railTransportation) {
		this.railTransportation = railTransportation;
	}

	public int getRoadTransportation() {
		return roadTransportation;
	}

	public void setRoadTransportation(int roadTransportation) {
		this.roadTransportation = roadTransportation;
	}

	public int getAirTransportation() {
		return airTransportation;
	}

	public void setAirTransportation(int airTransportation) {
		this.airTransportation = airTransportation;
	}

	public Ports(int cityId, String cityName, int railTransportation, int roadTransportation, int airTransportation) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.railTransportation = railTransportation;
		this.roadTransportation = roadTransportation;
		this.airTransportation = airTransportation;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of ports");
		int size = sc.nextInt();
		System.out.println("Insert port Deatails");
		System.out.println("available transportaion enter 1 otherwise enter 0 ");
		System.out.println("cityID cityName  railtransportition   roadtransportation   airTransportaion");
		Ports[] ports = new Ports[size];
		for (int insert = 0; insert < size; insert++) {
			Ports port = new Ports(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			ports[insert] = port;
		}
		String one = "";
		String more = "";
		for (int retrive = 0; retrive < ports.length; retrive++) {
			int lenght = ports[retrive].getAirTransportation() + ports[retrive].getRailTransportation()
					+ ports[retrive].getRoadTransportation();
			if (lenght < 2) {

				more += ports[retrive].getCityId() + "    " + ports[retrive].getCityName() + "\n";
			} else {
				one += ports[retrive].getCityId() + "     " + ports[retrive].getCityName() + "\n";
			}
		}

		System.out.println("One Then More Mode of Transaction");
		System.out.println("cityID     CityName");
		if (!one.isEmpty()) {
			System.out.println(one);

		} else {
			System.out.println("There is no such Transportations are available");

		}
		System.out.println("One Mode Transaction");
		System.out.println("cityID     CityName");
		if (!more.isEmpty()) {
			System.out.println(more);

		} else {
			System.out.println("There is no such Transportaions are available");
		}
	}

}
