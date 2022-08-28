import java.util.Scanner ;

class HotelTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of food items");
		 int size = sc.nextInt();
		 
		 Hotel hotel = new Hotel(size);
		 
		for(int i=0; i<size;i++) {
			
		   FoodItemsDTO foodItem = new FoodItemsDTO();
		   
		   System.out.println("Enter the id of the foodItem");
		   int id = sc.nextInt();
		   System.out.println("Enter the food name");
		   String name = sc.next();
		   System.out.println("Enter the price of the food ");
		   int price = sc.nextInt();
		   System.out.println("Enter type of the food");
		   String type = sc.next();
		   
		   foodItem.setId(id);
		   foodItem.setName(name);
		   foodItem.setPrice(price);
		   foodItem.setType(type);
		   
		   hotel.createFoodItem(foodItem);
		 
		 }
		 
		 {
			 System.out.println("");
		 }
		 String option = null;
		 do{
			 System.out.println("Enter 1 to fetch the food items");
			 System.out.println("Enter 2 to update the food name by id");
			 System.out.println("Enter 3 to update the Food Price by Name");
			 System.out.println("Enter 4 to delet Food by Name");
			 System.out.println("Enter 5 to delet Food By Type");
			 
			 int choise = sc.nextInt();
			 
			  switch(choise){
				  case 1: hotel.getFoodItemDetails();
				          break;
			      case 2: System.out.println("Enter the existing id for the name has to be updated");
				          int existingId = sc.nextInt();
						  System.out.println("Enter Name to be updated");
						  String updateName = sc.next();
						  hotel.updateFoodNameById(existingId, updateName);
						  break;
				  case 3: System.out.println("Enter the existing name for the food price has to be updated");
				          String existingName = sc.next();
                          System.out.println("Enter the price to be updated");
                          int updatePrice = sc.nextInt();
                          hotel.updateFoodPriceByName(existingName, updatePrice);
						  break;
                  case 4: System.out.println("Enter the existing name for food has to deleted");
                          String existingName1 = sc.next();
                          hotel.deletFoods(nameToBeDeleted);
						  break;
                  case 5: System.out.println("Enter the existing type for food has to be deleted");
                          String existingType = sc.next();
                          hotel.deletFoods(typeToBeDeleted);	
                          break;	
                default : System.out.println("Please enter valid choises from above");
                          break;				
			  }
			  System.out.println("Do You want continue Y/N");
			  option = sc.next();
		 }
		 while(option.equals("Y"));
		 
	  }

}