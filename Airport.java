class Airport{


    TerminalDTO[] terminals ;
	int index;
	
	public Airport(int size){
	  terminals = new TerminalDTO[size];
      System.out.println("The Airport constructor is created");	  
	
	}
	public boolean createTerminal(TerminalDTO terminal){
	
	
	    System.out.println("Inside the createTerminal()");
		boolean isAdded = false;
		
		if(terminal != null && terminal.getId() != 0) {
		    
			this.terminals[index++] = terminal;
			isAdded = true;
			System.out.println("The terminals detail are saved");
		} else {
		   System.out.println("The terminals are not saved");
		
		}
	       System.out.println("the createTerminal() is ended");
	   return isAdded;
	}
	
	public void getTerminalDetails(){
	
	     
		 for(int i=0; i<terminals.length; i++){
		    
			  System.out.println(terminals[i].getId()+"  "+terminals[i].getName()+"  "+terminals[i].getNoOfLoadingBridges()+"  "+terminals[i].getNoOfDepartureGates()+"  "+terminals[i].getNoOfCheckinCounters());
		 
		 }
	     
	}
	
	public String getAllTerminalName(){
		System.out.println("Inside getAllTerminalName()");
		int i,j;
		for(i=0, j=0; j<terminals.length; j++){
			System.out.println("terminals[j].getName()");
			i++;
		}
		String[] allTerminalsName = new String[i];
		for(int k=0,m=0;k<>terminals.length; k++){
		allTerminalsName[m++] = terminals[k].getName();
		}
		return allTerminalsName;
	}

    public boolean updateTerminalNameById(){
		System.out.println("Inside updateTerminalNameById()");
		boolean updateName = false;
		for(int i=0; i<terminals.length; i++){
			if(terminals[i].getId == id){
				terminals.setName(name);
			  updateName	= true;
			}
			else{
				
			}
		}
		return updateName;
	}
	
	public boolean deleteTerminalById(int id){
		boolean terminalDeleted = false;
		 System.out.println("Inside the  deletTerminalById");
		 int i,j;
		 for(i=0, j=0; j<terminals.length; j++){
			if(!terminals[j].getId().equals(id)){
				//dtos[i] = null;
				
				terminals[i++] = terminals[j];
				terminalDeleted = true;
				System.out.println("Enter the id to be deleted");
			}	
			 
			else{
				System.out.println("Terminal's name is not found");
			}
		 }
		terminals =	Arrays.copyOf(dtos, i);
		 return terminalDeleted; 
			
	}
	
	public boolean deletTerminalByName(String name){
		boolean terminalDeleted = false;
		System.out.println("Inside the deletTerminalByName()");
		int i,j;
		for(i=0, j=0; j<terminals.length; j++){
			if(terminals[j].getName().equals(name)){
				terminals[i++] = terminals[j];
				terminalDeleted = true;
				System.out.println("Enter name to be deleted");
			}
			else{
				System.out.println("Terminal name is not matched");
			}
		}
		terminals = Array.copyOf(terminlas, i);
		return terminalDeleted;
	}

}