class IDBIBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("IDBIBank");
		intrest=intrest+1.5;
		super.intrestPer(intrest);
	}
	
}