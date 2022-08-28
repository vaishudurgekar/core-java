class ExamTester{

     public static void main(String a[]){
		// Exam.hallticket.
	   Exam exam = new Exam(1400);  //1200
	   System.out.println();
	    HallTicket hallTicket = new HallTicket("2022JP089", "Baba", "Babu", "Ashram", "SOM");
		//String HallTicket = null;  //
	    exam.allow(hallTicket);
	   
	   Exam exam1 = new SupplementoryExam();
	   exam1.fees = 1400;
	   exam1.allow(ticket);
	   System.out.println(SupplementoryExam.university);
	 }

}

//one object behaving differently in given instatnce of time called polymorphism.