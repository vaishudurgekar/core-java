package com.xworkz.library.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString

public class BookDTO {
	private int id;
	private String name;
	private int dateOfPublication;
	private String author;
}
