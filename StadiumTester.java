class StadiumTester{

  public static void main(String a[]){
  
    StadiumDTO stad = new StadiumDTO();
	stad.setId(1);
	stad.setName("Chinnaswamy");
	stad.setLocation("Banglore");
	stad.setContactNo(2346551235L);
	
    System.out.println(stad.getId()+ "  " +stad.getName()+ "   " +stad.getLocation()+ "  " +stad.getContactNo());
	stad.sportsCenter();
  
  }

}