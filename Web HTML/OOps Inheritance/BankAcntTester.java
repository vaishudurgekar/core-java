class BankTester
{
	public static void main(String a[])
	{
		Bank indian = new Indian();
		indian.intrestPer(5);
		
		Bank central = new CentralBank();
		central.intrestPer(5);
		
		Bank axis = new Axis();
		axis.intrestPer(5);
		
		Bank union = new UnionBank();
		union.intrestPer(5);
		
		Bank iib = new IndusIndBank();
		iib.intrestPer(5);
		
		Bank uco = new UCOBank();
		uco.intrestPer(5);
		
		Bank federal = new FederalBank();
		federal.intrestPer(5);
		
		Bank karnataka = new KarnatakaBank();
		karnataka.intrestPer(5);
		
		Bank idbi = new IDBIBank();
		idbi.intrestPer(5);
		
		Bank pnb = new PanjabNationalBank();
		pnb.intrestPer(5);
	}
	
}