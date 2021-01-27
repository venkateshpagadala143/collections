package com.ojas.Exception;

public class LeaveSystem {
	int leaves;

	public LeaveSystem(int leaves) {
		this.leaves = leaves;

	}

	void checkLeaves() throws LeaveQuotaExceedException {
		if (leaves < 20) {
			System.out.println("Take a leave have a nice day");
		} else {
			try {
				throw new LeaveQuotaExceedException("your leaves has been excedded");
			} catch (LeaveQuotaExceedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
