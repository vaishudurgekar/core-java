package com.xworkz.airport.crud;

interface Airport {

	public void getTerminalDetails();
	public boolean updateNamesById(int id,String airportName);
	public boolean deleteByType(String type);
	public boolean deleteByAirportName(String airportName);
}
