class EngineeringTester{

   public static void main(String a[]){
    
	  
     MechEng mech = new MechEng();
     mech.problemSolving();
     System.out.println("Mechanical Engineer");

     EEEEng eee = new EEEEng();
     eee.problemSolving();
	 System.out.println("EEE Engineer");
	 
	 CsEng cs = new CsEng();
	 cs.problemSolving();
	 System.out.println("Cs Engineer");
	 
	 EsEng es = new EsEng();
	 es.problemSolving();
	 System.out.println("Es Engineer");
	 
	 ChemicalEng chemical = new ChemicalEng();
	 chemical.problemSolving();
	 System.out.println("Chemical Engineer");
   }  

}