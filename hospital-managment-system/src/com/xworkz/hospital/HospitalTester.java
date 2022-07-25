package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constatnt.Gender;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {
	
  public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);  
	
	int size = sc.nextInt();
	HospitalImpl hos = new HospitalImpl(size);
	 
	for(int i=0; i<size; i++){
		
	 PatientDTO pat = new PatientDTO();
		
    System.out.println("Enter the id");
    int id = sc.nextInt();
    
    System.out.println("Enter the name");
      String name = sc.next();
      
     System.out.print("Enter the address");
     String address = sc.next();
     
     System.out.println("Enter the gender");
     String gender = sc.next();
     
     System.out.println("Enter the contact no");
      long contactNo = sc.nextLong();
      
    pat.setId(id);
    pat.setName(name);
    pat.setAddress(address);
    pat.setGender(Gender.valueOf(gender));
    pat.setContactNo(contactNo);
    
	
     System.out.println(pat);
     sc.close();
	}
	
     {
	   System.out.println("");
	 }
		
		String option = null;
	  do{
	       System.out.println("Enter 1 to fetch the Patients");
           System.out.println("Enter 2 to update the Patient's Address By Id");
		   System.out.println("Enter 3 to update the Patient's contact No By Id");
           System.out.println("Enter 4 to delet Patient Details By name");

       int choise = sc.nextInt();

         switch(choise){
			  case 1: hos.getPatientDetails();
					   break;
					   
			  case 2: System.out.println("Enter the Existing Id for address has to be upadted");
	                  int existingId1 = sc.nextInt();
	                  System.out.println("Enter the address to be updated");
	                  String updateAddress = sc.nextLine();
	                  hos.updatePatientAddressById(existingId1,updateAddress);
					  break;
			  
			  case 3: System.out.println("Enter the existing Id for contactNo has to be upadted");
	                  int existingId = sc.nextInt();
	                  System.out.println("Enter the contactNo to be updated");
               	      long updateContactNo = sc.nextLong();
              	      hos.updatePatientContactNoById(existingId,updateContactNo); 
                      break;
			  
			  case 4: System.out.println("Enter the to delet the patient");
	                  String nameToBeDeleted = sc.next();
	                  hos.deletePatientByName(nameToBeDeleted);
					  break;
		    default : System.out.println("Geven Choises cannot be delivered");
			          break;   
		    }	
             System.out.println("Do you want to continue Y/N");
             option = sc.next();			 
			
	   }
	    while(option.equals("Y"));
  }
}

