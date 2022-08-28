class Exam{
     
	 //has a relationship - the object has a reference of another object
	 
	 //instatnce variable/non static variable
     HallTicket hallTicket;  //is deferent for each candidate so need not to change static 
	 //static
	 static String university = "VTU";
	 //instatnce/non static
	 int fees;
	 
	 public Exam(int fees){  //one parameterised variable
	   System.out.println("Exam Constructor is called");
	   this.fees = fees;
	 }
	 
	 public boolean allow(HallTicket hallTicket){
		 System.out.println("Invoked allow() from Exam");
		 boolean isAllowed = false;
		 if(this.fees>=1400){
			 if(hallTicket != null){
				isAllowed = true;
				 this.hallTicket = hallTicket;
				 this.hallTicket.displayDetails();
				 System.out.println("Allowed to Write Exam..");
			 }
		 
		      else{
				  System.out.println("Pay The fees first..");
			  }
		 }
		 else{
			 System.out.println("No HallTicket.. No Exam.. Muchkondu Manege hogi");
		 }
		 
		 return isAllowed;
		 
	 }

}

