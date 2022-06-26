class ModeOfTransportTester{

  public static void main(String t[]){
      Bus bus = new Bus();
	  bus.ticketPrice = 799;
	  bus.busName = "Sea Bird";
	  bus.noOfSeats = 18;
	  bus.busNo = "PY05A0043";
	  
	System.out.println(bus.ticketPrice+ "  " +bus.busName+ "  " +bus.noOfSeats+ "  " +bus.busNo);
  
  }
}