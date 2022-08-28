class Addition{
	
public static void main(String a[]){
	int additionWithTwoNumbers = add(56, 56);
 System.out.println(additionWithTwoNumbers);
 
 int additionWithTwoNumbers1 = add(56, 56);
 System.out.println(additionWithTwoNumbers1);
}


 int add = add(56, 56, 67);


// method overloading

   public static int add(int a, int b){
	   
	 return a+b;
   }
   
   static void add(int a, int b, int c){
	   
	 System.out.println(a+b+c);
   }
}