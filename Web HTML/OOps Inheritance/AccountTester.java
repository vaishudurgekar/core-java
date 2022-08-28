class AccountTester{

  public static void main(String a[]){
   
   SavingsAccount sa = new SavingsAccount(15.00);
   sa.deposit(5000.00);
   sa.withdraw(500.00);
   sa.periodicInterest();
   
   double amount = sa.getBalance();
   System.out.println("Balance of existing Account"+ amount);
   
   
   SavingsAccount other = new SavingsAccount(0.3);
   
   sa.transfer(3000.00, other);
   
   double totalAmount = other.getBalance();
   System.out.println("Balance of other Account"+ totalAmount);
   
   //polymorphism
   BankAccount curr = new CurrentAccount();
   curr.deposite(5000);
   curr.deposite(1000);
   curr.withdraw(2000);
  }
}