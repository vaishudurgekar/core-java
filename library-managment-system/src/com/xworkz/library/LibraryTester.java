package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.crud.impl.LibraryImpl;
import com.xworkz.library.dto.BookDTO;

public class LibraryTester {
     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		LibraryImpl lb = new LibraryImpl(size);
		
		for(int i=0;i<size;i++)
		{
		BookDTO dto =new BookDTO();
		
		System.out.println("Enter the id of the book");
		int id = sc.nextInt();
		
		System.out.println("Enter name of the book");
		String name = sc.next();
		
		System.out.println("Enter the date of publication");
		int dateOfPublication = sc.nextInt();
		
		System.out.println("Enter the name of the author");
		String author = sc.next();
		
		dto.setId(id);
		dto.setName(name);
		dto.setDateOfPublication(dateOfPublication);
		dto.setAuthor(author);
		
		System.out.println(dto);
		
		sc.close();
		}
		{
			System.out.println("");
		}
		String option = null;
		
		do{
			System.out.println("Enter 1 to fetch book details");
			System.out.println("Enter 2 to update book details by id");
			System.out.println("Enter 3 to delete book details by name");
			System.out.println("Enter 4 to delete book contactNo by author");
			
			
			System.out.println("Enter the choice : ");
			int choice = sc.nextInt();
			
		switch(choice){
			case 1 : lb.getBooks();
			         break;
					 
			case 2 :System.out.print("Entre the existing Id for update Book name : ");
	                int existingId = sc.nextInt();
	                System.out.print("Entre the updated Book name : ");
	                String updateName=sc.next();
	                lb.updateBookNameById(existingId , updateName);
					 break;
					 
			case 3 : System.out.print("Enter the existing name for delete Book: ");
	                 String existingName = sc.next();
	                 lb.deleteBookByName(existingName);
					 break;
					 
			case 4 : System.out.print("Enter the existing author for delete Book: ");
	                 String existingauthor = sc.next();
	                 lb.deleteBookByAuthor(existingauthor);
					 break;
			
					 
			default : System.out.println("Enter the proper number");
			         break;
				
		}	
		System.out.println("Do you want to continue Y/N : ");				
			option = sc.next();
		}
		while(option.equals("Y"));
		
	}
}