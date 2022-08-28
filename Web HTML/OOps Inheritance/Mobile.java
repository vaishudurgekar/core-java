class Mobile{

   public void toMakeCall(String name){
      System.out.println("Name :"+name);
   }   
   
   public void toMakeCall(byte price, String colour){
     System.out.println("Price is:" +price+"  "+"Colour:" +colour);
   }
   
   public static void main(String[] args){
      Mobile mobile = new Mobile();
      mobile.toMakeCall("Samsung");
      mobile.toMakeCall(2 , "pink");
	  
	  
   }


}