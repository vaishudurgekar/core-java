import java.util.Scanner;

class CustomerTester{

   public static void main(String[] args){
      
	  Scanner scnr = new Scanner(System.in);
	   System.out.println("Enter the no of Order to be added");
	   
	   int size = scnr.nextInt();
	   
	   CustomerImpl cus = new CustomerImpl(size);
	   
	  for(int i=0; i<size; i++){
	  
	    System.out.println("Enter the order id");
		 int id = scnr.nextInt();
		System.out.println("Enter the Order name");
		 String name = scnr.next();
		System.out.println("Enter the Order No");
		 String no = scnr.nextInt();
		
		  OrderDTO dto = new OrderDTO();
		  dto.setId(id);
		  dto.setName(name);
		  dto.setQuantity(quantity);
		  
		  cus.createOrder(dto);
	  }
	  
	  {
		  System.out.println("");
	  }
	  
	  Stirng option = null;
	  do{
		  System.out.println("Enter 1 to fetch order details");
		  System.out.println("Enter 2 to fetch orer name by id");
		  System.out.println("Enter 3 to update order name by id");
		  System.out.println("Enter 4 to update order quantity by id");
		  System.out.println("Enter 5 to delet book by id");
		  
		  int choise = sc.nextint();
		  
		  switch(choise){
			  case 1: cus.getOrderDetails();
			          break;
			  case 2: System.out.println("Enter the existing id to fetch order name by id");
                      int existingId = sc.nextInt();
                      System.out.println("Enter the name of the order");
                      String name = sc.next();
					  cus.bookName(intId);
                      break;
              case 3: System.out.println("Enter id for update the order name");
                      int id = sc.nextint();
                      System.out.println("Enter the name to be updated");
                      String name = sc.next();
                       cus.updateOrderNameById(id, updateName);
					   break;
              case 4: System.out.println("Enter the id for update the order quantity");
                      int existingId = sc.nextInt();
                      System.out.println("Enter the quantity to be updated");
                      int quantity = sc.nextInt();
                       cus.updateOrderQuantity(id, updateQuantity);
					   break;
              case 5: System.out.println("Enter id for delet the order");
                       int availableId = sc.next();
                      cus.deletOrderById(availableId);		
                      break;
           default : System.out.println("Choose valid choise from above");
                     break;		   
		  }
		  System.out.println("Do you want to continue Y/N");
		  option=sc.next();
	 }
	 while(option.equals("Y"));
	 /* cus.getOrderDetails();
	  System.out.println("Enter the Existing Id for Name has to be updated");
	  int existingId = id;
	  System.out.ptintln("Enter the Name to be updated");
	  String updatedName = sc.nextLine();
	  cus.updateOrderNameById(existingId, updateName);
	  
	  
	 System.out.println("Enter the Existing id of the order has to be deleted");
	 String availableId = sc.next();
	 hos.deletPatientById(availableId);           */
	 
	 
   }

}

