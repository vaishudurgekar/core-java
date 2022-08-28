class HospitalTester1{
   
   public static void main(String a[]){
      PatientDTO dto = new PatientDTO();
	  dto.setId(1);
	  dto.setName("VG");
	  dto.setAddress("Karwar");
	  System.out.println(dto);
	  
	  PatientDTO dto1 = new PatientDTO();
	  dto.setId(2);
	  dto.setName("Vaish");
	  dto.setAddress("Bnglr");
	  System.out.println(dto1);
	  
/*	  int uniqueNumber = dto.hashCode();    //hashCode is work on hashing technique
	  dto.setId(1);
	  System.out.println("The Hashcode for parent dto is" + dto.hashCode());
	 // System.out.println(dto.equals(dto1));  //compare two address of the object
	 System.out.println(dto);
	 // System.out.println(dto.toString());   
	  
	  String hero = "Darshan";
	  String hero1 = "Darshan";                  //"darshan"
	  System.out.println(hero.equals(hero1);    //(hero.equalsIgnoreCase(hero1);       */
	  
	  
   }

}