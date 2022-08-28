class TestJava {
	public static int sumOfDigits(int number){
          if (number < 10) return -1;
          int sum = 0;
          while (number > 10){
             sum += number % 10;
            number /= 10;
          }
          return sum + number;
	}
 
	public static void main(String[] args) {
		int number = 1234;		
		int sumOfDigits = sumOfDigits(number);
 
		System.out.println("Number: " + number);		
		System.out.println("Sum Of Digits: " + sumOfDigits);		
	}
}