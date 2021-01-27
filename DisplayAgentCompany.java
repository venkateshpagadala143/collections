package oopsprograms;

import java.util.Scanner;

public class DisplayAgentCompany {
	static void companyMenu() {
		String menu = "1.Titanic";
		menu += "\n2.Acedia";
		menu += "\n3.Umbrella Corporation";
		menu += "\n4.Omini Corp";
		menu += "\nEnter your choice";
		System.out.println(menu);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] companys = { "Titanic", "Acedia", "Umbrella Corporation", "Omini Corp" };
		System.out.println("Enter The Nuber of Agents");
		int size = sc.nextInt();
		AgentCompanyFee[] agentcompany = new AgentCompanyFee[size];
		for (int index = 0; index < size; index++) {

			companyMenu();
			int option = sc.nextInt();
			System.out.println("1.new Agent" + "\n" + "2.EXisting Agent");
			int opt = sc.nextInt();
			if (opt == 1) {
				System.out.println("Enter Agent Id Name and  Address");
				Agent agent = new Agent(sc.next(), sc.next(), sc.next());
				Company company = new Company(101, "America", companys[option - 1]);
				System.out.println("Enter The Fees");
				int fees = sc.nextInt();
				AgentCompanyFee fee = new AgentCompanyFee(agent, company, fees);
				agentcompany[index] = fee;
			} else {
				System.out.println("Enter Agent Name");
				String agentName = sc.next();
				System.out.println("Enter The fees ");
				int fees = sc.nextInt();
				Agent agent = null;
				
				Company company = new Company(101, "America", companys[option - 1]);
				for (int check = 0; check < agentcompany.length; check++) {
					if (agentcompany[check].getAgent().getName().equals(agentName)) {
						agent = agentcompany[check].getAgent();
						break;
					}
				}
				AgentCompanyFee fee = new AgentCompanyFee(agent, company, fees);
				agentcompany[index] = fee;

			}
			

		}
		for (int i = 0; i < agentcompany.length; i++) {
			System.out.println(agentcompany[i]);
			
		}
		AgentBO agbo = new AgentBO();
		System.out.println("Enter the Company Name");
		String companyName = sc.next();
		agbo.displayAgentDeatailsByCompany(companyName, agentcompany);
		System.out.println("Enter the Agent  Name");
		String agentName = sc.next();
		agbo.displayCompanyDeatailsByAgent(agentName, agentcompany);
	}

}
