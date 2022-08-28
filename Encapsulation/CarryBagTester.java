class CarryBagTester{
  
  public static void main(String[] args){
	  
   CarryBag carry = new CarryBag();
   //carry.name = "VG";
   //carry.price = 8;
   
   carry.setName("VG");
   carry.setPrice(8);
   
   System.out.println(carry.getName()+ "   " +carry.getPrice());
   carry.holdThings();   
  }
}