package _13_01_2021_oops;

public class CompanyBO {

	public void displayCompanyDetails(Company[] companies) {
		String country = "india";
	//	System.out.println("Company ID   IATA Code          FMC Code          State           Country");
		String format=String.format("%-15s %-15s %-15s %-15s %s", "Company ID", "IATA Code", "FMC Code", "State", "Country","");
		System.out.println(format);
		for (int check = 0; check < companies.length; check++) {

			if (!country.equalsIgnoreCase(companies[check].getAddress().getCountry())) {
				System.out.println(companies[check]);
			}
		}
	}

	@Override
	public String toString() {

		return String.format("%-15s %-15s %-15s %s", "Company ID", "IATA Code", "FMC Code", "State", "Country");
	}
}
