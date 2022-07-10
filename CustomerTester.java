import java.util.Scanner;

class CustomerTester{

   public static void main(String[] args){
      
	  Scanner scnr = new Scanner(System.in);
	   System.out.println("Enter the no of Order to be added");
	   
	   int size = scnr.nextInt();
	   
	   Customer cus = new Customer(size);
	   
	  for(int i=0; i<size; i++){
	  
	    System.out.println("Enter the order id");
		 int id = scnr.nextInt();
		System.out.println("Enter the Order name");
		 String name = scnr.next();
		System.out.println("Enter the Order No");
		
		  OrderDTO dto = new OrderDTO();
		  dto.setId(id);
		  dto.setName(name);
		  dto.setNo(no);
		  
		  cus.createOrder(dto);
	  }
	  cus.getOrderDetails();
   }

}