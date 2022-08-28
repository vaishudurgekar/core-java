class Ac{
 
 static String brand = "LG";
 static String colour = "white";
 static double price = 40000;
 static boolean isconnected;
 
 public static void main(String a[]){
 onoroff();
 onoroff();
 }
 public static void onoroff(){
    System.out.println("Invoking onoroff()");
	if (isconnected==false){
	     isconnected=true;
		 System.out.println("Ac is turned on...");
	}
	
	else if (isconnected==true){
	  isconnected=false;
	  System.out.println("Ac is turned off...");
	}
	System.out.println("End of onoroff");
 }
}

 public static void main(String a[]){
	onOrOff();
	increasetemparature();
	increasetemparature();
	increasetemparature();
	increasetemparature();
	increasetemparature();
	increasetemparature();
	decreasetemparature();
	decreasetemparature();
	decreasetemparature();
	decreasetemparature();
	decreasetemparature();
	decreasetemparature();
	onOrOff();
 }
 
 public static void increasetemparature(){
 System.out.println("increase temparature method started");
 if(isconnected == true){
 System.out.println("Ac is turned onn...");
 if(currentemparature < maxtemparature){
	currentemparature = maxtemparature + 1;
	System.out.println("the current temparature is: "+currentemparature);
	
 } 
  else{
	 System.out.println("max temparature is reached");
  }	
     System.out.println("increasetemparature method ended");
  }
  else{
	  System.out.println("koti Ac on maadu...");
  }
    System.out.println("increase temparature method ended");
  }
  
  public static void decreasetemparature(){
	  System.out.println("decreasetemparature method started");
	  if(isconnected == true){
		  System.out.println("Ac is turned onn...");
		  if(currentemparature > mintemparature){
			  currentemparature = currentemparature - 1;
			  System.out.println("the current temparature is: "+currentemparature);
		  }
      else{
		  System.out.println("mintemparature is reached");
	  }
	     System.out.println("decreasetemparature method ended");
	  }
	  else{
		  System.out.println("koti temparature on maadu...");
	  }
	  System.out.println("decrease temparature method ended");
  }
  
}