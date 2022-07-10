(26 sloc)  965 Bytes
class Hotel{


    FoodItemsDTO[] foodItems ;
	int index;
	
	public Hotel(int size){
	  foodItems = new FoodItemsDTO[size];
      System.out.println("The Hotel constructor is created");	  
	
	}
	
	public boolean createFoodItem(FoodItemsDTO foodItem){
	
	    System.out.println("Inside the createFoodItem()");
		boolean isAdded = false;
		
		if(foodItem != null && foodItem.getName() != null) {
		    
			this.foodItems[index++] = foodItem;
			isAdded = true;
			System.out.println("The foodItems detail is saved");
		} else {
		   System.out.println("The foodItems is not saved");
		
		}
	       System.out.println("the createFoodItem() is ended");
	   return isAdded;
	}
	
	public void getFoodItemDetails(){
	
	     
		 for(int i=0; i<foodItems.length; i++){
		    
			  System.out.println(foodItems[i].getId()+"  "+foodItems[i].getName()+"  "+foodItems[i].getPrice()+"  "+foodItems[i].getType());
		 
		 }
	     
	}