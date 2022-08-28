class BankAcnt
{
 double amount ;
//Method Started
void deposit(double amt) //called method
{
amount = amount + amt; 
System.out.println("amount to be dpst" +amt);
}
//Method Started
void withdaw(double amt)
{
amount = amount - amt;
System.out.println("amount to be withdaw" +amt);
}
double getTotalAmount()
{
System.out.println("Total Amount" +amount);
return amount;
}

public void transfer(double amount , BankAccount other)
{
	withdaw(amount);
	other.deposit(amount);	
}
}