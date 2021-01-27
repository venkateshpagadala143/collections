package oopsprograms;

import java.util.Scanner;

public class DisplayRole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of Roles");
		int size = sc.nextInt();
		Role[] roles = new Role[size];
		for (int insert = 0; insert < size; insert++) {
			System.out.println("Enter RoleName");
			String name = sc.nextLine();
			System.out.println("Enter Description");
			String description = sc.nextLine();
			System.out.println("Enter Preveligies");
			String prevel = sc.nextLine();
			String[] pre = prevel.split(",");
			Prevelige[] prevelize = new Prevelige[pre.length];
			for (int index = 0; index < pre.length; index++) {
				Prevelige pr = new Prevelige(pre[index]);
				prevelize[index] = pr;
			}

			Role role = new Role(name, description, prevelize);
			roles[insert] = role;
		}
		RoleBO rbo = new RoleBO();
		rbo.display(roles);

	}

}
