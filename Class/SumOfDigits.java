class SumOfDigits  
{  
	public static void main(String args[])  
	{  
	int number, digit, sum[] = 1234; 
	System.out.print("Enter the number: ");    
	{     
	digit = number % 10; 
	sum = sum + digit;  
	number = number / 10;  
	}  
	System.out.println("Sum of Digits: "+sum);  
	}  
}  