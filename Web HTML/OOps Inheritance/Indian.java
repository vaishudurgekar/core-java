class Indian extends Bank
{
	@Override
	public void intrestPer(double intrest)
	{
		System.out.println("IndianBank");
		intrest=intrest+1.1;
		super.intrestPer(intrest);
	}
	
}