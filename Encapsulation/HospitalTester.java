import java.util.Scanner ;  //when we use Scanner we have to write import java.util.Scanner;
//comment import - java resolved as cannot find symbol
class HospitalTester{
   
   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);  //Scanner - data that we provide at runtime
        System.out.println("Enter the no of patient to be added");
	
		int size = sc.nextInt();
		   
		   
	  	Hospital hos = new Hospital(size);
          
		   for(int i=0; i <size ; i++)
		   {
			   
		PatientDTO dto = new PatientDTO();
		
        System.out.println("Enter the patient name");
	    String name = sc.next();		   //we are using next() method for string type of data , for int - nextInt()
        System.out.println("Enter the address of the patient");
        String address = sc.next();
		System.out.println("Enter the id of the patient");    
		int id = sc.nextInt();
		System.out.println("Enter the Gender of the patient");
		String gender = sc.next();
		System.out.println("Enter the contact No of the patient");
		long contactNo = sc.nextLong();
		System.out.println("Enter the age of the Patient");
		int age = sc.nextInt();
		
		
	        dto.setGender(Gender.valueOf(gender));
	        dto.setName(name);
	        dto.setAddress(address);
	        dto.setId(id);
            dto.setContactNo(contactNo);
	        dto.setAge(age);
	
	        hos.createPatient(dto);
	 
	    }
		
		{
			System.out.println("");
		}
		
		String option = null;
		do{
	       System.out.println("Enter 1 to fetch the Patients");
           System.out.println("Enter 3 to update the Patient's Address By Id");
		   System.out.println("Enter 2 to update the Patient's contact No By Id");
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

/* PatientDTO dto1 = new PatientDTO();
	 System.out.println("Enter the patient name");
	    String name1 = sc.next();		   //we are using next() method for string type of data , for int - nextInt()
        System.out.println("Enter the address of the patient");
        String address1 = sc.next();
		System.out.println("Enter the id of the patient");    
		int id1 = sc.nextInt();
	 //dto1.setGender(Gender.MALE);
	 dto1.setId(id1);
	 dto1.setName(name1);
	 dto1.setAddress(address1);
	 /*dto1.setContactNo(2345678999L);
	 dto1.setAge(50);*/
	 
	/* PatientDTO dto2 = new PatientDTO();
	 dto2.setId(3);
	 dto2.setName("Jenny");
	 dto2.setAddress("JP Nagar");
	 dto2.setGender(Gender.female);
	 dto2.setContactNo(1233565236L);
	 dto2.setAge(34);
	 
	
	/* hos.createPatient(dto);
	hos.createPatient(dto1);
	/* hos.createPatient(dto2);   */
	
	
	/* hos.getPatientDetails();
	// invoking updatePatientAddressById method
	 System.out.println("Enter the Existing Id for address has to be upadted");
	 int existingId = sc.nextInt();
	 System.out.println("Enter the address to be updated");
	 String updateAddress = sc.nextLine();
	 hos.updatePatientAddressById(existingId,updateAddress);
	 
	/* System.out.println("Enter the Existing Id for contactNo has to be upadted");
	 int existingId = sc.nextInt();
	 System.out.println("Enter the contactNo to be updated");
	 String updateContactNo = sc.nextLine();
	 hos.updatePatientContactNoById(existingId,updateContactNo);
	 hos.getPatientDetails(); 
	 
	 System.out.println("Enter the Existing name of the patient has to be deleted");
	 String availableName = sc.next();
	 hos.deletePatientByName(availableName);
	 
	 hos.getPatientDetails();   */
	 