package _13_01_2021_oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayCompanyDeatails {
	public static void main(String[] args) {
		System.out.println("Enter the Number of Companies");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Company[] companies = new Company[size];
		for (int insert = 0; insert < size; insert++) {
			System.out.println("Enter the company " + insert+1 + " Deatails");
			System.out.println("Enter Company Id ");
			String companyId = sc.next();
			System.out.println("Enter Company IATA Code :");
			String iata = sc.next();
			System.out.println("Enter company FMC Code");
			String fmc = sc.next();
			System.out.println("Enter the company State");
			String state = sc.next();
			System.out.println("Enter the comapny Country");
			String country = sc.next();
			Address add = new Address(state, country);
			Company company = new Company(companyId, iata, fmc, add);
			companies[insert] = company;
		}
		CompanyBO com=new CompanyBO();
		com.displayCompanyDetails(companies);
	}

}
