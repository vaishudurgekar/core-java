class BankAccount2{
 static double amount;
/* public static void main(String a[])
 {
 System.out.println("main method started");
 deposite(2000);
 //invoke withdraw()
 withdraw(1300);
 System.out.println("main method ended");
 }*/
 
 static void deposite(double amt)
 {
 System.out.println("invoked deposit()");
 System.out.println("Amount to be deposite"+ amt);
 System.out.println("Amount before deposite"+amount);
 amount= amount+ amt;
 System.out.println("Amount after deposite"+ amount);
 System.out.println("end of deposite()");
 }
 
 static void withdraw(double amt)
 {
 System.out.println("invoked withdraw()");
 System.out.println("Amount to be withdraw"+ amt);
 System.out.println("Amount before withdraw"+ amount);
 amount = amount-amt;
 System.out.println("Amount after withdraw" +amount);
 System.out.println("end of withdraw()");
 }
   public static void totalAmount(double amt){
	   System.out.println("invoked total amount");
	   System.out.println("The total Amount in Bank Account is" + amount);
   }
   public double getBalance(){
   return amount;
   }
   
   public void transfer(double amount, Bank Account other){
	   withDraw(amount);
	   other.deposit(amount);
   }
}