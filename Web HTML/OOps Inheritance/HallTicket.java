class HallTicket{

   
   String rollNo;
   String subjectCode;
   String candidateName;
   String examCenter;
   String subjectName;
   
   public HallTicket(String rollNo, String subjectCode, String candidateName, String examCenter, String subjectName){
     this.rollNo = rollNo;
	 this.subjectCode = subjectCode;
	 this.candidateName = candidateName;
	 this.examCenter = examCenter;
	 this.subjectName = subjectName;
   }
   
   
   public void displayDetails(){
      System.out.println("The Roll No is" + this.rollNo);
	  System.out.println("The subjectCode is" + this.subjectCode);
	  System.out.println("The Candidate Name is" + this.candidateName);
      System.out.println("The Exam Center is" + this.examCenter);
	  System.out.println("The subject name is" + this.subjectName);
   }

}