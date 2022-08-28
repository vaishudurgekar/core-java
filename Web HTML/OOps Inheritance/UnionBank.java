class UnionBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("UnionBank");
		intrest=intrest+2;
		super.intrestPer(intrest);
	}
	
}