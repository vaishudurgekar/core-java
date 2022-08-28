class Temparature{                     //calling in metod crearing another method
           
   // int temparature;
   static int temp=30;
   
    public static void main(String[] args){
	System.out.println(Temparature.temp);  //reuseability of code
	check();
	 
	
   }
   
   public int getTemp( int temp){
	  
	  return temp;
   }
   public static void check(){
	   if(temp<=30){
		   System.out.println("The temp is high");
	   }
	   else{
		   System.out.println("The temp is low");
	   }
   }
}