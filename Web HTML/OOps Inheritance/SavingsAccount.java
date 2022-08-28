class SavingsAccount extends BankAccount{

   double interestRate;
   public SavingsAccount(double interestRate){
   //super() will be called by compiler
      this.interestRate = interestRate;
   }
   //calculate periodicInterest
   public double periodicInterest(){
     double interest = getBalance() * interestRate/100;
	 deposit(interest);
	 return interest;
   }

}