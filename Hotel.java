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
	
	public boolean updateFoodNameById(int id, String name){
	  System.out.println("Inside updateFoodNameById()");
	  boolean updateName = false;
	  for(int i=0; i<dtos.length; i++){
		  if(dtos[i].getId() == id){
			  dtos[i].setName(name);
			  updateName = true;
		  }
		  else{
			  System.out.println("Inside updateFoodNameById name is not updated");
		  }
	  }
	  return updateName;
   }
   
   public boolean updateFoodPriceByName(String name, double price){
	   System.out.println("Inside updateFoodPriceByName()");
	   boolean updatePrice = false;
	   for(int i=0; i<dtos.length; i++){
		   if(dtos[i].getName() = name){
		   dtos[i].setPrice(price);
		   updatePrice = price;
		   }
		   else{
			   System.out.println("Inside updateFoodPriceByName price is not updated");
		   }
	   }
	   return updatePrice;
   }
   
   public boolean deleteFoodsByName(String name){
		boolean foodsDeleted = false;
		 System.out.println("Inside the  deletFoodsByName");
		 int i,j;
		 for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getName().equals(name)){
				
				dtos[i++] = dtos[j];
				foodsDeleted = true;
				System.out.println("Enter the name to be deleted");

			}	
			 
			else{
				System.out.println("Food's name is not found");
			}
		 }
		dtos =	Arrays.copyOf(dtos, i);
		 return foodsDeleted; 
			
	}
	
	public boolean deletFoodItemByType(String type){
		boolean foodsDeleted = false;
		System.out.println("Inside deletFoodItemByType()");
		int i,j;
		for(i=0, j=0; j<dtos.length; j++){
			if(!dtos[j].getType().equals(type)){
				dtos[i++] = dtos[j];
				foodsDeleted = true;
				System.out.price("Enter the type to be deleted");
			}
			else{
				System.out.price("Foods type is not found");
			}
		}
		dtos = Array.copyOf(dtos, i);
		return foodsDeleted;
	}
}