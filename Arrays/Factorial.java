class Factorial{

    public static void main(String a[]){
		
		\\invoking fact method
	   int factValue = fact(7);
	System.out.println(factValue);
	}

	public static int fact(int factNumber){
		System.out.println("invoked fact()");
		System.out.println("Parameter value" + factNumber);
	    int f = 1;
	   for(int i=1; i <= factNumber ; i++){
	      f = f*i;
	   
	   }
	return f;
	}
}