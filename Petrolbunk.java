class PetrolBunk{

   int id;
   static String name;
   int gst = 56;
   String type;
   static String location = "Banglore";
   
   
     public PetrolBunk(int petrolBunkId, String nm, String tp){
	  System.out.println("Petrol Bunk Object Created");
	  id = petrolBunkId;
	  name = nm;
	  type = tp;
	 }
   
   
   public static void main(String vais[]){
     
	 PetrolBunk petrol = new PetrolBunk(1, "Indian Oil", "Petrol");
	 System.out.println(petrol.id+ "  "+ petrol.name+ "  "+petrol.type);
	 System.out.println(petrol.gst + "  " + petrol.location);
	 
	 PetrolBunk petrol1 = new PetrolBunk(2, "Bharat Petrolium", "Disel");
	 System.out.println(petrol1.id+ "  "+petrol1.name+ "  "+ petrol1.type);
	 System.out.println(petrol.gst + "  " + petrol.location);
   }


}
   


