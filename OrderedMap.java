package _06_01_2021_collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderedMap {
	Map<Integer, String> orderMap;

	public OrderedMap() {
		orderMap = new LinkedHashMap<Integer, String>();
	}

	public Map<Integer, String> getOrderedMap() {
		return orderMap;
	}

	public void setOrderedMap(Map<Integer, String> orderedMap) {
		this.orderMap = orderedMap;
	}

	private void addElement(int key, String value) {

		orderMap.put(key, value);
	}

	public static void main(String[] args) {
		OrderedMap ormap = new OrderedMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Elements");
		int size = sc.nextInt();
		System.out.println("plese Enter  key and value");
		for (int insert = 0; insert < size; insert++) {
			ormap.addElement(sc.nextInt(), sc.next());
		}
		Map<Integer, String> mapdata = ormap.getOrderedMap();

		for (Map.Entry<Integer, String> data : mapdata.entrySet()) {

			System.out.println(data.getKey() + "," + data.getValue());
		}

	}

}
