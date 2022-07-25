package com.xworkz.airport.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Terminal {
	private int id;
	private String name;
	private int noOfLoadingBridges;
	private int noOfDepartureGates;
	private int noOfCheckIncounters;
}