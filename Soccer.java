package com.ojas.sports;

public class Soccer extends Sports {
	@Override
	String getName(String sportName) {

		return super.getName(sportName);
	}

	@Override
	String getNumberOfTeamMembers() {
		String spors[]= {"vollyball","soccer","cricket","hockey","FootBool"};
		int  players[]= {6,11,11,9,10};
		for(int index=0;index<spors.length;index++) {
			if(sportsNames.equals(spors[index])) {
				
				return "In "+super.getName(sportsNames)+ ",each team has "+players[index]+" players";		
			
		}
			
		}
		return null;
	}

}
