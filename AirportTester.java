class AirportTester{

   public static void main(String a[]){

   AirportDTO air = new AirportDTO();
   air.setId(1);
   air.setName("Kempegowda International Airport");
   air.setLocation("Banglore");
   air.setPostalCode(560300);
   
   System.out.println(air.getId()+ "  " +air.getName()+ "  " +air.getLocation()+ "  " +air.getPostalCode());
   air.traveling();
   }
}