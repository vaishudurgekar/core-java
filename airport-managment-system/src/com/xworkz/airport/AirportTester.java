package com.xworkz.airport;

import java.util.Scanner;

import com.xworkz.airport.crud.impl.AirportImpl;
import com.xworkz.airport.dto.Terminal;

public class AirportTester {
     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int size = sc.nextInt() ;
		AirportImpl air = new AirportImpl(size);
    	 
    	 for(int i=0;i<size ;i++)
 		{
    		 
    	 Terminal ter = new Terminal();
    	 
    	 System.out.println("Enter the id of terminal");
    	 int id = sc.nextInt();
    	 
    	 System.out.println("Enter the name of the terminal");
    	 String name = sc.next();
    	 
    	 System.out.println("Enter the no of loading bridges");
    	 int noOfLoadingBridges = sc.nextInt();
    	 
    	 System.out.println("Enter the no of departure gates");
    	 int noOfDepartureGates = sc.nextInt();
    	 
    	 System.out.println("Enter the no of check incounters");
    	 int noOfCheckIncounters = sc.nextInt();
    	 
    	 ter.setId(id);
    	 ter.setName(name);
    	 ter.setNoOfLoadingBridges(noOfLoadingBridges);
    	 ter.setNoOfDepartureGates(noOfDepartureGates);
    	 ter.setNoOfCheckIncounters(noOfCheckIncounters);
    	 
    	 System.out.println(ter);
    	 sc.close();
 		}
    	 {
    		 System.out.println("");
    	 }
    	 String option = null;
    	 
    	 do{
 			System.out.println("Enter 1 to fetch terminal details");
 			System.out.println("Enter 2 to update terminal details");
 			System.out.println("Enter 3 to delete terminal details by type");
 			System.out.println("Enter 4 to delete terminala details by name");
 			
 			
 			System.out.println("Enter the choice");
 			int choice = sc.nextInt();
 			
 		switch(choice){
 			case 1 : air.getTerminalDetails();
 			         break;
 					 
 			case 2 : System.out.println("enter existing id");
 		             int existingId = sc.nextInt();
 		             System.out.println("enter new name");
 		             String updatedName = sc.next();
 		             air.updateNamesById(existingId,updatedName);
 					 break;
 					 
 			case 3 : System.out.println("enter type");
 		             String type1=sc.next();
 		             air.deleteByType(type1);
 					 break;
 				
 					 
 			case 4 : System.out.println("enter name");
 		             String name=sc.next();
 		             air.deleteByAirportName(name);
 					 break;
 					 
 					 
 			default : System.out.println("Enter the proper number");
 			         break;
 				
 		}	
 		System.out.println("Do you want to continue Y/N");				
 			option = sc.next();
 		}
 		while(option.equals("Y"));
 		
 		
	}
}
