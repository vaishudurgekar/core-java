class  SumOfDigits1
 {
   public static void main (String[]args)
   {

     int num = 1234, sum = 0;
       System.out.println ("Sum of digits : " + getSum (num, sum));
   }

   static int getSum (int num, int sum)
   {

     if (num == 0)
       return sum;

     sum += num % 10;
     return getSum (num / 10, sum);
   }
 }