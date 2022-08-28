class SupplementoryExam extends Exam{

   public SuplementoryExam(){
     System.out.println("The Supplementory Exam constructor is called");
   }

   
   @Override
   public boolean allow(HallTicket ticket){
	   System.out.println("Invoked allow() from SupplementoryExam");
	  return super.allow(ticket);
   }
}