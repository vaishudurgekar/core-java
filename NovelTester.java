class NovelTester{

   public static void main(String a[]){
   
      Novel novel = new Novel();
	  novel.setId(6);
	  novel.setName("Jane Eyre");
	  novel.setWriterName("Charlotte Bronte");
	  novel.setWrittenIn(1847);
	  
	  System.out.println(novel.getId() +  " "  +novel.getName()  +" "  +novel.getWriterName()  +" "  +novel.getWrittenIn());
	  novel.gainKnowledge();
   
   
   }

}