package com.xworkz.block;

public class Block {
	
	public Block() {
		System.out.println(this.getClass().getSimpleName() + "Object is created");
	}
	static{
		System.out.println("Block1");
	}
	
	{
		System.out.println("Block2");
	}
	
	public static void m() {
		System.out.println("m method of block");
	}
}


//Blocks are used to initialization of variable


//blocks 
//getClass   getsimpleName
//heap memory and stack memory