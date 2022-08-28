public class CarryBag{
	 
   public CarryBag(){
	   
	   
   }
   
   //to achieve Encapsulation
   private String name;
   private double price;
   
   //getter and setter
   //difference btwn to variable we decalre this
   public String getName(String name){
	   return name;
   }
   
   public void setName(String name){
	   this.name = name;
   }
   
   public double getPrice(double price){
	   return price;
   }
   
   public void setPrice(double price){
	   this.price = price;
   }
   
   public void holdThings(){
      System.out.println("Holding vegitables");
   }

}