class Bag{

  String brandName;
  String colour;
  int price;
  
  public Bag(String brandName, String colour, int price){
    this.brandName = brandName;
	this.colour = colour;
	this.price = price;
  }
  
  public void toHoldLaptop(){
     System.out.println("Bag is used to hold Laptop");
  }
}