package com.xworkz.hotel.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class FoodItems {
	private int id;
	private String foodName;
	private String type;
	private int price;
}
