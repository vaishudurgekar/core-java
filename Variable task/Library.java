class Library{

  int id;
  String type= "College Library";
  static String name;
  static String location = "Banglore";
  long contactNo;
  
  
   public Library(int libraryId, String nm, long cNo){
     System.out.println("Library object created");
	 id = libraryId;
	 name = nm;
	 contactNo = cNo;
	} 
	 
	
	 public static void main(String vais[]){
		 
	   Library lib = new Library(1, "Christ University Library", 4325671893L);
	   System.out.println(lib.id+ "  "+ lib.name+ "  "+ lib.contactNo);
	   System.out.println(lib.type+ "  "+ lib.location);
	   
	   Library.lib1 = new Library(2, "UTC Library", 9874561233L);
	   System.out.println(lib1.id+ "  "+ lib1.name+ "   "+ lib1.contactNo);
	   System.out.println(lib.type+ "  "+ lib.location);
	 }

}