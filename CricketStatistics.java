package _29_12_02020_IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CricketStatistics {
	static int size = 1;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Player player = new Player();

		while (true) {
			System.out.println("Please Select an option" + "\n" +
		                        "1.Add Player" + "\n"+
					            "2.Search an Player by player Name" + "\n" + 
		                        "3.Display All players" + "\n" +
					            "4.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please Enter PlayerName  Country  hightScore  totalRuns ");
				player.setPlayerName(sc.next());
				player.setCountry(sc.next());
				player.setHighestScore(sc.nextDouble());
				player.setTotalRuns(sc.nextDouble());
				storeEmpInfo(player);
				break;

			case 2:
				seachAnEmployee();
				break;
			case 3:
				displayAllPlayers();
				break;
			case 4:
				System.out.println("Thank you" + "\n" + "Your Session Has Been Compleated");
				System.exit(4);

			}
		}

	}

	private static void displayAllPlayers() throws NumberFormatException, IOException {
		FileReader fr = new FileReader("E:/Praveen/Player.txt");
		BufferedReader bf = new BufferedReader(fr);

		String line;
		int num = 0;
		while ((line = bf.readLine()) != null) {

			String str[] = line.split(",");
			Player play = new Player(str[0], str[1], Double.parseDouble(str[2]), Double.parseDouble(str[3]));
			System.out.println(play);

		}

	}

	private static void seachAnEmployee() throws IOException {
		FileReader fr = new FileReader("E:/Praveen/Player.txt");
		BufferedReader bf = new BufferedReader(fr);
		Player[] player = new Player[size];
		String line;
		int num = 0;
		while ((line = bf.readLine()) != null) {
			String str[] = line.split(",");
			Player play = new Player(str[0], str[1], Double.parseDouble(str[2]), Double.parseDouble(str[3]));
			player[num] = play;

			size++;
		}
		System.out.println("Enter an Player Name");
		Scanner sc = new Scanner(System.in);
		String playerName = sc.next();
		size = size - 2;
		System.out.println(size + 1);
		for (Player pla : player) {
			if (pla.getPlayerName().equalsIgnoreCase(playerName)) {
				System.out.println(pla.getPlayerName() + "," + pla.getCountry() + "," + pla.getHighestScore() + ","
						+ pla.getTotalRuns());
				size = 1;
				break;
			}
		}
		System.out.println("please Enter a valid  EmpId");
		size = 1;

	}

	private static void storeEmpInfo(Player player) throws IOException {
		String res = player.getPlayerName() + "," + player.getCountry() + "," + player.getTotalRuns() + ","
				+ player.getHighestScore();
		FileWriter fw = new FileWriter("E:/Praveen/Player.txt", true);

		fw.write(res + "\n");
		fw.flush();
		fw.close();

	}
}
