class IplTester{

    public static void main(String a[]){
	
	 Ipl ip = new Ipl();
	 ip.setId(3);
	 ip.setNoOfPlayers(25);
	 ip.setNoOfMatches(74);
	 ip.setLocation("Banglore");
	 
	 System.out.println(ip.getId()+ " " +ip.getNoOfPlayers()+ " " +ip.getNoOfMatches()+ " " +ip.getLocation());
	 ip.toWinCup();
	
	}

}