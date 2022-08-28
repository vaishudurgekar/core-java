class SumDigi {
	int Sum = 0, Reminder;
	public int sDigits(int Number) {
		if(Number > 0) {
			Reminder = Number % 10;
			Sum = Sum + Reminder;
			sDigits(Number / 10);		
			return Sum;
		}
		else {
			return 0;
		}
	}
}