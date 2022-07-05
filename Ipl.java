public class Ipl{

  public Ipl(){
  }

   private int id;
   private int noOfPlayers;
   private int noOfMatches;
   private String location;
   
   
   public int getId(){
     return id;
   }
   public void setId(int id){
      this.id = id;
   }
   
   public int getNoOfPlayers(){
   return noOfPlayers;
   }
   public void setNoOfPlayers(int noOfPlayers){
     this.noOfPlayers = noOfPlayers;
   }
   
   public int getNoOfMatches(){
     return noOfMatches;
   }
   public void setNoOfMatches(int noOfMatches){
     this.noOfMatches = noOfMatches;
   }
   
   public String getLocation(){
     return location;
   }
   public void setLocation(String location){
     this.location = location;
   }
   
   
   public void toWinCup(){
      System.out.println("Ee Sala Cup Namde");
   }
   
}