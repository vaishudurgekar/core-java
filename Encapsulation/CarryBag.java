/*  1)   class must be public in acess to have encapsulated file
       class member are private to have encapulated file
       each getter and setter
       one default constructor 
       it should not have any method except getter and setter    */
public class CarryBag{
	 //2) rule
   public CarryBag(){
	   
   }
   
   //to achieve Encapsulation - the process of grouping the data into a single block/unit is known as encapsulation.
           //only for security
		   
	//3) rule	   
   private String name;
   private double price;
   
   //getter and setter
   //we write getter by having a prefix as get
   /* public returnType getVariableName(){ 
              return variableName;
      } */
   //difference btwn to variable we decalre this
   //4) rule
   public String getName(){
	   return name;
   }
   //we right setter by hahing a prefix as set
   /* public void setVariableName(datatype variableName){
	     this.variableName = variableName;
      } */
   public void setName(String name){
	   this.name = name;
   }
   
   public double getPrice(){
	   return price;
   }
   
   public void setPrice(double price){
	   this.price = price;
   }
   
   
   public void holdThings(){
      System.out.println("Holding vegitables");
   }

}


//In encapsulation Design Pattern called DTO[Data Transfer Object]