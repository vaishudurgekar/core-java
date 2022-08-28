class CurrentAccount extends BankAccount{


int freeTrasactions = 7;
int trasactionCount;
double TransactionFee = 0.7;
public void withdraw(double amount){
  trasactionCount++;
}
@Override
public void deductFee(){
  if(trasactionCount > freeTrasactions);
    double interest = transactionFee * (trasactionCount - freeTrasactions);
	withDraw(interest);
}

public int getTransactionCount(){
   return trasactionCount;
}

}