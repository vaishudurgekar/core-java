package com.xworkz.customer.crud.impl;

import java.util.Arrays;

import com.xworkz.customer.dto.Order;

public class CustomerImpl {
	
		Order[] dtos;
		
		int index;
		
		public CustomerImpl(int size)
		{
			System.out.println("OrderDTO constructor is created");
			dtos = new Order[size];
		}
		
		public void getItem()
		{
			for(int i=0;i<dtos.length;i++)
			{
				System.out.println("Cart details : ");                   
				System.out.println(dtos[i]);
			}
		}
		public boolean updateTypeById(int id , String type)
		{
			boolean updateType=false;
			for(int i=0;i<dtos.length;i++)
			{
				if(dtos[i].getId() == id)
				{
					dtos[i].setType(type);
					updateType=true;
					System.out.println("Type updated successfully");
				}
			}
			return updateType;
		}
		
		public boolean deleteOrderByType(String type)
		{ 
			boolean deleteOrder=false;
			int i , j;
			for( i=0,j=0;j<dtos.length;j++)
			{
				if(!dtos[j].getType().equals(type))
				{				
					dtos[i++]=dtos[j];
					deleteOrder=true;
					System.out.println("Deleted successfully");				
				}
	         						
			}
			dtos=Arrays.copyOf(dtos,i);
			return deleteOrder;
		}
		
		public boolean deleteOrderByName(String name)
		{ 
			boolean deleteOrder=false;
			int i , j;
			for( i=0,j=0;j<dtos.length;j++)
			{
				if(!dtos[j].getName().equals(name))
				{				
					dtos[i++]=dtos[j];
					deleteOrder=true;
					System.out.println("Deleted successfully");				
				}
	         						
			}
			dtos=Arrays.copyOf(dtos,i);
			return deleteOrder;
		}
		
		public String getOrderNameById(int id)
		{
			String name=null;
			for(int i=0;i<dtos.length;i++)
			if(dtos[i].getId() == id)
			{
				name=dtos[i].getName();
				System.out.println("Name of the Order : "+dtos[i].getName());
			}
			return name;
		}
		
		public String getOrderTypeByName(String name)
		{
			String type=null;
			for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName().equals(name))
			{
				type=dtos[i].getType();
				System.out.println("Type of the Order : "+dtos[i].getType());
			}
			}
			return type;
		}
		
		
	}
