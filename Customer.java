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
}