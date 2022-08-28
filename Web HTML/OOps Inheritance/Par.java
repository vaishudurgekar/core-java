class Par{
  
  public static void main(String a[]){
    System.out.println("Parent"); 
	
	Par parent=new Par();
	Par.relation();
	parent.relation();
  }
   static void relation(int pr){
	   System.out.println("int pr");
   }
   
   void relation(){
	   System.out.println("relation with no parameter");
   }
  
}



