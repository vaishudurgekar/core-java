package com.xworkz.customer;

import java.util.Scanner;

import com.xworkz.customer.crud.impl.CustomerImpl;
import com.xworkz.customer.dto.Order;

public class CustomerTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		CustomerImpl cus = new CustomerImpl(size);
		
		for(int i=0;i<size ;i++)
		{
		Order or = new Order();
		
		System.out.println("Enter the order id");
		int id = sc.nextInt();
		
		System.out.println("Enter the order name");
		String name = sc.next();
		
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		
		or.setId(id);
		or.setName(name);
		or.setQuantity(quantity);
		
		System.out.println(or);
		sc.close();
	}
		{
			System.out.println("");
		}
		 String option = null;
		
		 do
		   {
			  System.out.println("Enter 1 to fetch all the Order details : ");
			   System.out.println("Enter 2 to update Type by Id : ");
			    System.out.println("Enter 3 to delete Order By Name : ");
				 System.out.println("Enter 4 to delete Order By Type : ");
				 System.out.println("Enter 5 to get Order Name By ID : ");
				 System.out.println("Enter 6 to delete Order Type By Name : ");
				 System.out.print("Please enter NO : ");
				 int choise = sc.nextInt();
				 
				 switch(choise)
				 {
					 case 1 : cus.getItem();
					          break;
							  
					 case 2 : System.out.print("Enter the ID of item : ");
				              int existingid = sc.nextInt();
				              System.out.print("Enter a Type of the item : ");
				              String existingtype = sc.next();
				              cus.updateTypeById(existingid, existingtype);
							  break;
							  
		   	         case 3 : System.out.print("Enter the existing Name for delete order: ");
		                      String existingName1 = sc.next();
		                      cus.deleteOrderByName(existingName1);
							  break;
		   	  
			         case 4 : System.out.print("Enter the existing type for delete order: ");
		                      String existingType1 = sc.next();
		                      cus.deleteOrderByType(existingType1);
					 
	                 case 5 : System.out.print("Enter the existing ID for Name of the order: ");
		                      int existingId = sc.nextInt();
		                      cus.getOrderNameById(existingId);
	 
	                 case 6 : System.out.print("Enter the existing Name for Type of the order: ");
		                      String existingTypeForName = sc.next();
		                      cus.getOrderTypeByName(existingTypeForName);
				    default : System.out.print("Wrong option");
	                          break;
											  
				 }
				 System.out.print("Do you continue Y/N : ");		  
	                option= sc.next();
		   }
		   while(option.equals("Y"));

	}
}
