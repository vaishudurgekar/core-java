import java.util.Scanner ;

class AirportTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of terminals");
		 int size = sc.nextInt();
		 
		 Airport airport = new Airport(size);
		 
		for(int i=0; i<size;i++) {
			
		   TerminalDTO terminal = new TerminalDTO();
		   
		   System.out.println("Enter the id of the terminal");
		   int id = sc.nextInt();
		   System.out.println("Enter the terminal name");
		   String name = sc.next();
		   System.out.println("Enter the no of loading bridges ");
		   int noOfLoadingBridges = sc.nextInt();
		   System.out.println("Enter the depature gates");
		   int noOfDepartureGates = sc.nextInt();
		   System.out.println("Enter the check in counters");
		   int noOfCheckIncounters = sc.nextInt();
		   
		   terminal.setId(id);
		   terminal.setName(name);
		   terminal.setNoOfLoadingBridges(noOfLoadingBridges);
		   terminal.setNoOfDepartureGates(noOfDepartureGates);
		   terminal.setNoOfCheckinCounters(noOfCheckIncounters);
		   
		   airport.createTerminal(terminal);
		 
		 
		 }
		 
		 {
			 System.out.println("");
		 }
		 
		 do{
			 System.out.println("Enter 1 fetch the terminals");
			 System.out.println("Enter 2 to fetch the terminals by name");
			 System.out.println("Enter 3 to update terminal name by Id");
			 System.out.println("Enter 4 to delet terminal by Id");
			 System.out.println("Enter 5 to delet terminal by name");
			 
			 int choise = sc.nextInt();
			 
			 switch(choise){
				 case 1: airport.getTerminalDetails();
				            break;
			     case 2: airport.getAllTerminalsName();
				         break;
				 case 3: System.out.println("Enter the Existing id for the Name has to be updated");
	                     int existingId = sc.nextInt();
	                     System.out.println("Enter the Name to be updated");
	                     String updateName = sc.nextLine();
	                     lib.updateTerminalNameById(existingId, updateNsme); 
                           break;
                 case 4: System.out.println("Enter the Existing id of the patient has to be deleted");
	                     int availableId = sc.next();
	                     airport.deletTerminalById();
						 break;
				 case 5: System.out.println("Enter name to be deleted");
				         String name = sc.next();
						 airport.deletTerminalByName();
						 break;
                 default :System.out.println("Given choises cannot be ");
				          break;
			 }
			 System.out.println("Do you want to continue Y/N");
			 option = sc.next();
		 }
		 while(option.equals("Y"));
		 
	  }

}