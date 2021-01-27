package oopsprograms;

public class AgentBO {
	void displayAgentDeatailsByCompany(String name, AgentCompanyFee[] agentCompanyFee) {
		System.out.println("Company has");
		for (int display = 0; display < agentCompanyFee.length; display++) {

			if (name.equals(agentCompanyFee[display].getCompany().getCompanyName())) {
				System.out.println(
						agentCompanyFee[display].getAgent().getName() + " " + agentCompanyFee[display].getFees());
			}

		}

	}

	void displayCompanyDeatailsByAgent(String name, AgentCompanyFee[] agentCompanyFee) {

		System.out.println("Agent works for");
		for (int display = 0; display < agentCompanyFee.length; display++) {
			if (name.equals(agentCompanyFee[display].getAgent().getName())) {
				System.out.println(agentCompanyFee[display].getCompany().getCompanyName());
			}

		}

	}
}
