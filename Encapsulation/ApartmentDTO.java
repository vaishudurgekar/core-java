//DTO[Dtat Transfer Object}
public class ApartmentDTO{

   public ApartmentDTO(){
   }
   
   private int id;
   private String name;
   private int noOfRooms;
   private String location;
   
   
   public int getId(){
	   return id;
   }
   public void setId(int id){
	   this.id = id;
   }
   
   public String name(){
	   return name;
   }
   public void setName(String name){
	   this.name = name;
   }
   
   public int getNoOfRooms(){
	   return noOfRooms;
   }
   public void toLive(){
	   System.out.println("To Live");
   }

}