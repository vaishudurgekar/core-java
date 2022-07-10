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
	       
	     BookDTO dto = new BookDTO();
	      dto.setName(name);
	      dto.setId(id);
	   
	     lib.createBook(dto);
	    }
	   lib.getBookDetails();
   }

}