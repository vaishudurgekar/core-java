class Fruits{
	
//instance variables
 
 String name;
  int price;
  
   public Fruits(){   //parameterised variables
           //this("Mango", 789); 
  this.provideNutrition ();   //this("Orange", 60)--compile error-recursion. cant able to run
    System.out.println("Fruits object is created");
  }
  
  public void provideNutrition(){ //-method 
	 //this();//- not applicable in any other method
   System.out.println("Helps to get nutrition");
  }
  
   public Fruits(String name,int price){   //parameterised variables/constructor
    this(); //this method - call consturctor from another-- first statement of the constructor - at the time of constructo overloading
    this.name = name;
	this.price = price;
  }
  
  public static void main(String a[]){
  
  Fruits f = new Fruits("kivi", 150);
  System.out.println(f.name+ "  " + f.price);
 //this .provideNutrition();
  }

}

//this method can use inside only constructor
//this keyword - can use to invoke instance of class/ similar to rreference vareables/same as object/ use instance data