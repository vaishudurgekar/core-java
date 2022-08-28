import java.util.Arrays;

class Hospital{

        //Has many patients
       PatientDTO[] dtos ;
	 

      int index;	 
	 
	 public Hospital(int size){
		 dtos = new PatientDTO[size];
	   System.out.println("Hospital const is called");     //everthing will set at the creation of object , create object inside the constructor
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
	
	 
	 public boolean updatePatientAddressById(int id, String address){
		 System.out.println("Inside the updatePatientAddressById()");
		 boolean updateAddress = false;
		 for(int i= 0; i<dtos.length; i++){
			 if(dtos[i].getId() == id){
				 dtos[i].setAddress(address);
				 updateAddress = true;
			 }	
			 else{
				 System.out.println("Inside the updatePatientAddressById is not upadated");
			 }
		 }
		return updateAddress; 
	 }
	 
	public boolean updatePatientContactNoById(int id, long contactNo){
		 System.out.println("Inside the updatePatientContactNoById()");
		 boolean updateContactNo = false;
		 for(int i= 0; i<dtos.length; i++){
			 if(dtos[i].getId() == id){
				 dtos[i].setContactNo(contactNo);
				 updateContactNo = true;
				 System.out.println("Patient contact No is Updated");
			 }	
			 else{
				 System.out.println("Inside the updatePatientContactNoById is not upadated");
			 }
		 }
		return updateContactNo; 
	 } 
	 
	public boolean deletePatientByName(String name){
		boolean patientDeleted = false;
		 System.out.println("Inside the  deletPatientByName");
		 int i,j;
		 for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getName().equals(name)){
				//dtos[i] = null;
				
				dtos[i++] = dtos[j];
				patientDeleted = true;
				//System.out.println("Enter the name to be deleted");
				//i--;
			}	
			 
			else{
				System.out.println("Patient's name is not found");
			}
		 }
		dtos =	Arrays.copyOf(dtos, i);
		 return patientDeleted; 
			
	}

}