class CarryBagTester{

   CarryBag carry = new Carrybag();
   //carry.name = "VG";
   //carry.price = 8;
   
   carry.setName("VG");
   carry.setPrice(8);
   
   System.out.println(carry.setName()+ "   " +carry.setPrice());
   carry.holdThings();   

}