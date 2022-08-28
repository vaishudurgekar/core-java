class Parent{
  
  public static void main(String a[]){
    System.out.println("Parent"); 
	
	Parent parent=new Parent();
	Parent.relation();
	parent.relation(7);
  }
   static void relation(int){
	   System.out.println("int pr");
   }
   
   void relation(){
	   System.out.println("relation with no parameter");
   }
  
}	



