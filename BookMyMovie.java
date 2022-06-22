class BookMyMovie{

   String movies[] = {"Om", "Galipata", "Upendra", "Yajamana", "Mayura", "Rakta Kanneeru", "H2O"};
   
   String theatrename;
   int noOfTickets;
   static int ticketPrice = 600;
   int totalNoOfTickets = 200;
   int totalTicketPrice;
   
   String snacks[] = {"Popcorn", "gobi", "Samosa", "Sweet corn"};
   
   int quantityOfSnacks;
   static int snackPrice = 150;
   int totalNoOfSnacks = 50;
   int totalSnackPrice;
   
   
   public BookMyMovie(String theatrename, int noOfTickets, String movieName, String snackname, int quantityOfSnacks){
     System.out.println("BookMyMovie object is created");
	 this.theatrename = theatrename;
	 this.noOfTickets = noOfTickets;
	 this.movieName = movieName;
	 
	 
	 this.snackName = snackName;
	 this.quantityOfSnacks = quantityOfSnacks;
   }
   
   public int showTime(int noOfTickets, String bookedBy, String movieName){
	   int totalTicketPrice = 0;
     System.out.println("inside showTime()...");
	 System.out.println("Arg 1 : No Of Tickets "+ noOfTickets);
     System.out.println("Arg 2 : Booked By "+ bookedBy);
     System.out.println("Arg 3 : Movie Name "+ movieName);
   
    for(int index = 0 ; index < movies.length ; index++){
	    if(movieName == movies[index]){
			System.out.println("Movie name matched");
		}
		 else{
           System.out.println("Movie not available");
         }
		
	  if(noOfTickets < totalNoOfTickets){
	  totalNoOfTickets = noOfTickets*ticketPrice;
	  totalNoOfTickets = totalNoOfTickets - noOfTickets;
	  System.out.println("For Movie : " + movieName + "No Of Tickets are That are remaining : " + totalNoOfTickets + " Total Price is " + totalTicketPrice);
	  }
		
	  else{
	    System.out.println("Istu Ticket Illa...");
	  }
	

	}
         return totalTicketPrice ;
   }
   
   
   public int buySnacks(String snackName, int quantity){
	   int totalSnackPrice = 0;
	   System.out.println("Arg 1 : Name of Snacks "+snackName);
	   System.out.println("Arg 2 : Quantity of Snack "+ quantityOfSnacks);
	   
	   for(int index = 0 ; index < snacks.length ; index++){
	     if(snackName == snacks[index]){
		   System.out.println("Snack name matched");  
	     }
		 else{
			 System.out.println("Snack not available");
		 }
		 
		  if(noOfSnacks < totalNoOfSnacks){
			totalNoOfSnacks = noOfSnacks*snackPrice;
			totalNoOfSnacks = totalNoOfSnacks - noOfSnacks;
			System.out.println("For snack : " + snackName + "No of snacks are remaining :"+ totalNoOfSnacks + "Total price is" + totalSnackPrice);
		  }
		  else{
			 System.out.println("This much snacks not available...");
		  }
       }
   }
    return totalSnackPrice ;
	   
}
   

      

   
