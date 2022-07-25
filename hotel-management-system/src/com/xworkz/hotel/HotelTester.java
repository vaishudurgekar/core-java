package com.xworkz.hotel;

import java.util.Scanner;

import com.xworkz.hotel.dto.FoodItems;

public class HotelTester {

	public static void main(String[] args) {
	 
    	Scanner sc = new Scanner(System.in);
    	
    	FoodItems food  = new FoodItems();
    	
    	System.out.println("Enter the id of the food");
    	int id = sc.nextInt();
    	
    	System.out.println("Enter name of the food");
    	String name = sc.next();
    	
    	System.out.println("Enter the Type of the food");
    	String type = sc.next();
    	
    	System.out.println("Enter the price of the food");
    	int price = sc.nextInt();
    	
    	food.setId(id);
		food.setFoodName(name);
    	food.setType(type);
    	food.setPrice(price);
    	
    	System.out.println(food);
    	sc.close();
    }
}
