class CentralBank extends Bank
{
     public void intrestPer(double intrest)
	 {
	 System.out.println("CentralBank");
	 intrest=intrest+0.75;
	 super.intrestPer(intrest);
	 }
}