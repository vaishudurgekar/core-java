package com.xworkz.customer.crud;

interface Customer {

	 void getItem();
	 boolean updateTypeById(int id , String type);
	 boolean deleteOrderByType(String type);
	 boolean deleteOrderByName(String name);
	 String getOrderNameById(int id);
	 String getOrderTypeByName(String name);
}
