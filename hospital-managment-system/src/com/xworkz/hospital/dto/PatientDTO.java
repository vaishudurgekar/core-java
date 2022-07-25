package com.xworkz.hospital.dto;

import com.xworkz.hospital.constatnt.Gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PatientDTO { 
	  private int id;
	  private String name;
	  private String address;
	  private Gender gender;
	  private long contactNo;
}
