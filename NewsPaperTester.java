class NewsPaperTester{

   public static void main(String a[]){
   
    NewsPaper news = new NewsPaper();
	news.setId(423);
	news.setName("Banglore Times");
	
	System.out.println(news.getId()+ "  " +news.getName());
	
	news.toRead();
   
   }

}