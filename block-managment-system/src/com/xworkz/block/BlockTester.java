package com.xworkz.block;

public class BlockTester {
	
    public BlockTester() {  
	System.out.println(this.getClass().getSimpleName()+ "Block object is created");
    }

    int blockInit;
  
  {
	  System.out.println("Block1 is executed");
	//  blockInit = 10;
  }
  
  {
	System.out.println("Block2 is exicuted");  
  }
  
  public static void main(String[] args) {
	   System.out.println("Main method is started");
	   BlockTester blockTester = new BlockTester(); 
	   System.out.println(blockTester.blockInit);
	   
	   System.out.println("Main method is ended");
	   
  }
}