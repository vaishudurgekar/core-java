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

}