class FederalBank extends Bank
{
	public void intrestPer(double intrest)
	{
		System.out.println("FederalBank");
		intrest=intrest+3;
		super.intrestPer(intrest);
	}
	
}