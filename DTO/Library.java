class Library{

   BookDTO[] dtos;
   
   int index;
   
   public Library(int size){
      dtos = new BookDTO[size];
	  System.out.println("Library const is called");
   }
   
   public boolean createBook(BookDTO dto){
      System.out.println("Inside createBook");
	  boolean isAdded = false;
	  if(dto != null && dto.getName() != null){
	    this.dtos[index++] = dto;
		 isAdded  = true;
		 System.out.println("Book details added successfully");
	  }
	  else{
	     System.out.println("Cannot add Books.. Please fill the form...");
	  }
	  return isAdded;
   }
   
   public void getBookDetails(){
      System.out.println("Inside getBookDetails()");
	  for(int i = 0; i< dtos.length; i++){
	    System.out.println(dtos[i].getId()+ " " +dtos[i].getName());
	  }
	  
   }
   public void getBookNameById(int id){
	   System.out.println("Inside getBookNameById()");
	   String bookName = null;
	   for(int i=0; i< dtos.length; i++){
		  if(book[i].getId()==id){
			  bookName = books.getName();
		  }
		  else{
			  System.out.println("The id is not matched");
		  }
	   }
	   return bookName;
   }
   
   public void getAllBooksName(){
	   System.out.println("Inside getAllBooksName()");
	   int i j;
	   for(i=0, j=0; j<dtos.length; j++){
		   System.out.println(books[j].getName());
		   j++;
	   }
	   String[] allBooksName = new String[j];
	   for(int k=0; k<dtos.length; k++){
		   allBooksName[m++] = books[k].getName();
	   }
	   System.out.println("End getAllBooksName()");
	   return allBooksName;
   }
   
   public boolean updateBookNameById(int id, String name){
	  System.out.println("Inside updateBookNameById()");
	  boolean updateName = false;
	  for(int i=0; i<dtos.length; i++){
		  if(dtos[i].getId() == id){
			  dtos[i].setName(name);
			  updateName = true;
		  }
		  else{
			  System.out.println("Inside updateBookNameById name is not updated");
		  }
	  }
	  return updateName;
   }
   
   
    public boolean deleteBookById(int id){
		boolean bookDeleted = false;
		 System.out.println("Inside the  deleteBookById");
		 int i,j;
		 for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getId().equals(id)){
				
				dtos[i++] = dtos[j];
				bookDeleted = true;
				System.out.println("Enter the name to be deleted");
			}	
			 
			else{
				System.out.println("Book's name is not found");
			}
		 }
		     dtos =	Arrays.copyOf(dtos, i);
		 return bookDeleted; 
			
	}
	
	public boolean deletBookByAuthor(String author){
		boolean bookDeleted = false;
		System.out.println("Inside deletBookByAuthor()");
		int i j;
		for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getAuthor().equals(author)){
			dtos[j++] = dtos[j];
			bookDeleted = true;
			System.out.println("Enter the name to be deleted");
			}
			else{
				System.out.println("Books name is not found");
			}
		}
		dtos = Array.copyOf(dtos, i);
		return bookDeleted;
	}

}