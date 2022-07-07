class Hospital{

        //Has many patients
       PatientDTO[] dtos = new PatientDTO[6];
	 

      int index;	 
	 
	 public Hospital(){
	   System.out.println("Hospital const is called");   
	 }
	 
	 public boolean createPatient(PatientDTO dto){
		 System.out.println("Inside createPatient");
		 boolean isAdded = false;
		 if(dto != null && dto.getName() != null){
           this.dtos[index++] = dto;
			 isAdded = true;
			 System.out.println("Patient Details Added Successfully");
		 }
		 else{
			 System.out.println("Cannot add Patient... please fill ");
		 }
		 return isAdded;
	 }
	 
	 public void getPatientDetails(){
		 System.out.println("Inside getPatientDetails()");
		 for(int i=0; i<dtos.length; i++){
			 System.out.println(dtos[i].getId()+ " " +dtos[i].getName()+ " "+dtos[i].getGender()+ ""+dtos[i].getAddress()+ " "+dtos[i].getContactNo()+ " "+dtos[i].getAge());
		 }
		 
	 }
	 
	 
	   

}