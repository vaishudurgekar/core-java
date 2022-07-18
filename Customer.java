class Customer{

     OrderDTO[] dto;
   
      int index;
   
    public Customer(int size){
	  dto = new OrderDTO[size];
	  System.out.println("Customer const is called");
	}
	
	public boolean createOrder(OrderDTO dto){
	   System.out.println("Inside createOrder");
	    boolean isPlaced = false;
	  if(dto != null && dto.getName() != null)
        this.dtos[index++] = dto;
		  isPlaced = true;
		 System.out.println("Order Details added Successfully");
	  }
	  else{
	     System.out.println("Cannot Place order... please give the detatils");
		  for(int i = 0; i< dtos.length; i++){
		      System.out.println(dtos[i].getId()+ " " +dtos[i].getName()+ " " +dtos[i].getNo());
		  }
	}
	
	public void getOrderDetails(){
		System.out.println("Inside getOrderDetails()");
		for(int i=0; i<dtos.length; i++){
			System.out.println(dtos[i].getId()+ " " +dtos[i].getName()+ " " +dtos[i].getNo());
		}
	}
	
	public void getOrderNameById(int id){
		System.out.println("Inside getOrderNameById()");
		String bookName = null;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId()==id){
				bookName = books[i].getName();
			}
			else{
				System.out.println("The id is not matched");
			}
		}
		return bookName;
	}
	
	public boolean updateOrderNameById(){
		System.out.println("Inside the updateOrderNameById()");
		boolean updateName = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setName(name);
				updateName = true;
			}
			else{
				System.out.println("Inside the updateOrderNameById is not updated");
			}
		}
		return updateName;
	}
	
	public boolean updateOrderQuantityById(){
		System.out.println("Inside the updateOrderNoById()");
		boolean updateNo = false;
		for(int i=0; i<dtos.length; i++){
			if(dtos[i].getId() == id){
				dtos[i].setNo(no);
				updateQuantity = true;
			}
			else{
				System.out.println("inside the updateOrderQuantityById is not updated");
			}
		}
		return updateOrderQuantity;
	}
	
	public boolean deleteOrderById(String id){
		boolean orderDeleted = false;
		 System.out.println("Inside the  deletOrderById()");
		 int i,j;
		 for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getId().equals(id)){
				
				dtos[i++] = dtos[j];
				orderDeleted = true;
				System.out.println("Enter the name to be deleted");
			}	
			 
			else{
				System.out.println("Order's name is not found");
			}
		 }
		dtos =	Arrays.copyOf(dtos, i);
		 return orderDeleted; 
			
	}
}