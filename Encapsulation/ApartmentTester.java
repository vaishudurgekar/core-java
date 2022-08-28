class ApartmentTester{

   public static void main(String[] a){
   
      ApartmentDTO dto = new ApartmentDTO();
	  dto.setId(6);
	  dto.setName("Ecostay");
	  dto.setNoOfRooms(357);
	  dto.setLocation("Banglore");
	  
	  System.out.println(dto.getId()+ " " +dto.getName()+ " " +dto.getNoOfRooms()+ " " +dto.getLocation());
	  
	  dto.toLive();
   }

}