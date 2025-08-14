package service;

import java.util.Scanner;

import cricket.Team;
import repositary.TeamRepositary;


public class TeamService {
	/*public void printTeamDetails() {
	System.out.println(TeamRepositary.getMITeamDetails());
		
	

    System.out.println(TeamRepositary.getRCBTeamDetails());
        
	


    System.out.println(TeamRepositary.getCSKTeamDetails());


    System.out.println(TeamRepositary.getGTTeamDetails());



    System.out.println(TeamRepositary.getKKRTeamDetails());

    System.out.println(TeamRepositary.getLSGTeamDetails());


    System.out.println(TeamRepositary.getPKTeamDetails());



    System.out.println(TeamRepositary.getRRTeamDetails());



    System.out.println(TeamRepositary.getSHTeamDetails());

}*/
	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");
		System.out.println("3. Get team Id Details");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);
		
		switch (input) {
		
		//get All team details
		case 1: {
			System.out.println(TeamRepositary.getMITeamDetails());
			System.out.println(TeamRepositary.getRCBTeamDetails());
			System.out.println(TeamRepositary.getCSKTeamDetails());
			System.out.println(TeamRepositary.getGTTeamDetails());
			System.out.println(TeamRepositary.getKKRTeamDetails());
			System.out.println(TeamRepositary.getLSGTeamDetails());
			System.out.println(TeamRepositary.getPKTeamDetails());
			System.out.println(TeamRepositary.getRRTeamDetails());
			System.out.println(TeamRepositary.getSHTeamDetails());
		    break;
		}
		
		//get team details by short Name
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			String teamShortName = sc.next();
			System.err.println("entered team short name is  : " + teamShortName);
		    getTeamByShortName(teamShortName);
			break;
		}
		
		//get team details by id
		case 3:{
			System.out.println("Please enter your fav team's Id: ");
			int teamIdDetails = sc.nextInt();
			System.err.println("entered team Id is  : " + teamIdDetails);
		    getTeamIdDetails(teamIdDetails);
			break;
		}
		
		
		
	}
	}
	
	    public void getTeamIdDetails(int id) {
	    	if(id==101) {
	    		System.out.println(TeamRepositary.getMITeamDetails());
	    	}
	    	
	    		else if (id==102) {
	                System.out.println(TeamRepositary.getRCBTeamDetails());
	    	}
	    	
	    		else if (id==103)  {
	    			System.out.println(TeamRepositary.getCSKTeamDetails());  
	    	}
	    	
	    		
	    	
	    		else if (id==104) {
	    			System.out.println(TeamRepositary.getGTTeamDetails());
	    	}
	    	
	    		else if (id==105) {
	    			System.out.println(TeamRepositary.getKKRTeamDetails());
	    	}
	    	
	    		else if (id==106){
	    			System.out.println(TeamRepositary.getLSGTeamDetails());
	    	}
	    	
	    		else if (id==107) {
	    			System.out.println(TeamRepositary.getPKTeamDetails());
	    	}
	    	
	    		else if (id==108) {
	    			System.out.println(TeamRepositary.getRRTeamDetails());
	    	}
	    	
	    		else if (id==109) {
	    			System.out.println(TeamRepositary.getSHTeamDetails());  
	    	}
	    	
	    	
	    }
	    
	    
          public void getTeamByShortName(String shortName) {
			switch (shortName) {
			case "MI": {
				System.out.println(TeamRepositary.getMITeamDetails());
				break;
			}
			
			case "RCB":{
				System.out.println(TeamRepositary.getRCBTeamDetails());
				break;
			}
			
			case "CSK":{
				System.out.println(TeamRepositary.getCSKTeamDetails());
				break;
			}
			
			case "GT":{
				System.out.println(TeamRepositary.getGTTeamDetails());
				break;
			}
			
			case "KKR":{
				System.out.println(TeamRepositary.getKKRTeamDetails());
				break;
			}
			
			case "LSG":{
				System.out.println(TeamRepositary.getLSGTeamDetails());
				break;
			}
			
			case "PK":{
				System.out.println(TeamRepositary.getPKTeamDetails());
				break;
			}
			
			case "RR":{
				System.out.println(TeamRepositary.getRRTeamDetails());
			}
			
			case "SH":{
				System.out.println(TeamRepositary.getSHTeamDetails());
			}
			default:{
				throw new IllegalArgumentException("Unexpected value: " + shortName);
			}
		
		}
}
}

	
		
	


	

