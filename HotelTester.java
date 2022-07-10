(26 sloc)  948 Bytes
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
		 
		 hotel.getFoodItemDetails();
	  
	  }

}