class Operators{
   int a;
   int b;
   
   
    public Operators(int a, int b){  //constructor
	  System.out.println("operators constructor is created");
    this.a=a;
	this.b=b;
    }
  
  
 
  public int add(){     //default constructor
	  Operators add = new Operators(20,10);
	  System.out.println("Sum of two no is " + (add.a+add.b));
	  return add.a+add.b;
  }
    
	public int diff(){
		Operators diff = new Operators(20,10);
		System.out.println("Diff of two no is" + (diff.a-diff.b));
		return diff.a-diff.b;
	}
	
	public int mult(){
		Operators mult = new Operators(20,10);
		System.out.println("Multiplication of two no is" +(mult.a * mult.b));
		return mult.a * mult.b;
	}
	
	public int div(){
		Operators div = new Operators(20,10);
			System.out.println("Division of two no is " + (div.a / div.b));
			return div.a / div.b;
	}
		
	public int mod(){
		Operators mod = new Operators(20,10);
		System.out.println("Mod of two no is" + (mod.a % mod.b));
		return mod.a % mod.b;
	}

	public static void main(String[] args){//main method
	Operators oper = new Operators(20,10);
	oper.add();
	oper.diff();
	oper.mult();
	oper.div();
	oper.mod();
  }
}