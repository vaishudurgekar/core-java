import java.util.Scanner;

class LibraryTester{

   public static void main(String a[]){
     
	 Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of Books to be added");
	  
	       int size = sc.nextInt();
	  
	  Library lib = new Library(size);
	  
	    for(int i=0; i<size; i++){
	  
	         System.out.println("Enter the Book Name");
	           String name = sc.next();
	         System.out.println("Enter the id of the Book");
	           int id = sc.nextInt();
			 System.out.println("Enter the Author of the Book");
			   String authorName = sc.next();
			 System.out.println("Enter the date of publication");
			    int publishedIn = sc.nextInt();
				
	       
	     BookDTO dto = new BookDTO();
	      dto.setName(name);
	      dto.setId(id);
	   
	     lib.createBook(dto);
	    }
		
		{
			System.out.println("");
		}
		
		String option = null;
		do{
			System.out.println("Enter 1 to fetch the Books");
			System.out.println("Enter 2 to fetch the Book name by id");
			System.out.println("Enter 3 to fetch all the books");
			System.out.println("Enter 4 to update the Boook name by Id");
			System.out.println("Enter 5 to delet the Book by Id");
			System.out.println("Enter 6 to delet book by author");
			
			int choise = sc.nextInt();
			
			switch(choise){
				case 1: lib.getBookDetails();
				         break;
			    case 2: System.out.println("Enter the id for name has to fetch");
				         int id = sc.nextInt();
						System.out.println("Enter the name");
						 String name= sc.next();
				         break;
				case 3: System.out.println("Enter all the books name by id");
				        int existingId = sc.nextInt();
						System.out.println("Enter all the books names");
						String allBooksName = sc.next();
				case 4: System.out.println("Enter the existing id for which name has to be updated");
				        int existingId = sc.nextInt();
						System.out.println("Enter the name to be updated");
						String updaetName = sc.next();
			            lib.updateNameById(existingId, updaetName);
						break;
				case 5: System.out.println("Enter the existing id of the book has to be deleted");
				        int availableId = sc.nextInt();
						lib.deletBookById(availableId);
						break;
				case 6: System.out.println("Enter the author name of the bbok has tyo be deleted");
				         int existingAuthorName =sc.nextInt();
						 lib.deletBookByAuthor(existingId);
			 default : System.out.println("Choose valid coises from the above");
			           break;
			}
			System.out.println("Do you want to continue Y/N");
			option = sn.nextInt();
		}
		while(option.equal("Y"));
	   
   }

}