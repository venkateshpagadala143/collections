package oopsprograms;

public class RoleBO {
	void display(Role[] role) {

		for (int check = 0; check < role.length; check++) {
			for (int index = check + 1; index < role.length; index++) {

				if (role[check].getPreveligies().length < role[index].getPreveligies().length) {
					Role temp = role[check];
					role[check] = role[index];
					role[index] = temp;

				}

			}

		}
		for (int retrive = 0; retrive < role.length; retrive++) {
			if (role[retrive].getPreveligies().length > 2) {
				System.out.println(role[retrive].getName());
			}

		}

	}

}
