class HospitalTester{
   
   public static void main(String[] args){
   
     Hospital hos = new Hospital();
	 
	 PatientDTO dto = new PatientDTO();
	 dto.setGender(Gender.MALE);
	 dto.setId(1);
	 dto.setName("Babu");
	 dto.setAddress("Banglore");
	 dto.setContactNo(2345678148L);
	 dto.setAge(56);
	 
	 PatientDTO dto1 = new PatientDTO();
	 dto1.setGender(Gender.MALE);
	 dto1.setId(2);
	 dto1.setName("Karan");
	 dto1.setAddress("Banglore");
	 dto1.setContactNo(2345678999L);
	 dto1.setAge(50);
	 
	 PatientDTO dto2 = new PatientDTO();
	 dto2.setId(3);
	 dto2.setName("Jenny");
	 dto2.setAddress("JP Nagar");
	 dto2.setGender(Gender.female);
	 dto2.setContactNo(1233565236L);
	 dto2.setAge(34);
	 
	 PatientDTO dto3 = new PatientDTO();
	 dto3.setId(4);
	 dto3.setName("Priya");
	 dto3.setAddress("Mysur");
	 dto3.setGender(Gender.female);
	 dto3.setContactNo(1234542315L);
	 dto3.setAge(20);

     PatientDTO dto4 = new PatientDTO();
     dto4.setId(5)	 ;
	 dto4.setName("Kartik");
	 dto4.setAddress("Bellary");
	 dto4.setGender(Gender.MALE);
	 dto4.setContactNo(1231231231L);
	 dto4.setAge(19);
	 
	 PatientDTO dto5 = new PatientDTO();
	 dto5.setGender(Gender.female);
	 dto5.setId(6);
	 dto5.setName("Siri");
	 dto5.setAddress("Banashankari");
	 dto5.setContactNo(5656342312L);
	 dto5.setAge(68);
	 
	 hos.createPatient(dto);
	 hos.createPatient(dto1);
	 hos.createPatient(dto2);
	 hos.createPatient(dto3);
	 hos.createPatient(dto4);
	 hos.createPatient(dto5);
	 
	 hos.getPatientDetails();
   }
}