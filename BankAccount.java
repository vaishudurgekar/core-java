class BankAccount{

     double amount;
   
   //METHOD TO GET totalAmount
   public  void main(String[] args){
   System.out.println("main method started");
   deposit(6700.00);
   getBalance();
   withDraw(550.00);
   getBalance();
   deposit(1200.00);
   getBalance();
   withDraw(750.00);
   getBalance();
   withDraw(200.00);
   getBalance();
   withDraw(250.00);
   getBalance();
   withDraw(100.00);
   getBalance();
   withDraw(500.00);
   getBalance();
   withDraw(2100.00);
   getBalance();
   withDraw(500.00);
   getBalance();
   withDraw(250.00);
   getBalance();
   withDraw(100.00);
   getBalance();
   withDraw(2500.00);
   getBalance();
   withDraw(450.00);
   getBalance();
   
   
   
   
   System.out.println("end of main method");
   }
   public  void deposit(double amt){
   System.out.println("invoke deposit()");
   System.out.println("amount to be deposit" +amt);
   System.out.println("balance/amount before deposit" +amount);
    amount=amount+amt;
   System.out.println("amount after deposit"+amount);
   System.out.println("end of deposit()");
   }
   public  void withDraw(double amt){
   System.out.println("invoke withDraw()");
   System.out.println("amount to be withDrawn" +amt);
   System.out.println("amount before withDraw" +amount);
    amount= amount-amt;
	if(amount<=0){
		System.out.println("insufficient balance");
	}else{
		System.out.println(amount);
	}
   System.out.println("amount after withDraw" +amount);
   System.out.println("end of withDraw()");
   }
   public  double getBalance(){
	   System.out.println("Total amount available in account is:" +amount);
	   
	   return amount;
   }
   
   //BANKACC OTHER IS BankAccount class created for other savingsacc object created i.e., deposit done to other acc i.e,transferred Account 
   public  void transfer(double amount, BankAccount other){
	   withDraw(amount);     //withdraw done wrt 1st savings acc created so used amount only
	   deposit(other.amount);   ////deposit done to other savingsacc created so used other.amount
	   
   } 
}