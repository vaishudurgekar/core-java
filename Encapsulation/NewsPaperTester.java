class NewsPaperTester{

   public static void main(String[] args){
   
     NewsPaperDTO news = new NewsPaperDTO();
	 news.setId(23);
	 news.setName("Times of India");
	 
	 System.out.println(news.getId()+ " "+news.getName());
	 
	 news.toRead();
   
   }

}