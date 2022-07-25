package com.xworkz.customer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Order {
	  private int id;
	  private String type;
	  private String name;
	  private int quantity;	  
}
