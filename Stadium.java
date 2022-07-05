public class Stadium{
   
   public Stadium(){
   }
   
   private int id;
   private String name;
   private String location;
   private long contactNo;
   
   public int getId(){
   return id;
   }
   public void setId(int id){
     this.id = id;
   }
   
   public String getName(){
     return name;
   }
   public void setName(String name){
     this.name = name;
   }
   
   public String getLocation(){
     return location;
   }
   public void setLocation(String location){
     this.location = location;
   }
   
   public long getContactNo(){
   return contactNo;
   }
   public void setContactNo(long contactNo){
     this.contactNo = contactNo;
   }
   
   public void sportsCenter(){
     System.out.println("Play Cricket");
   }
   
   
}