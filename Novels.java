public class Novel{

   public Novel(){
   }

   public int id;
   public String name;
   public String writerName;
   public int writtenIn;
   
   public int getId(){
     return id;
   }  
   public void setId(int id){
     thid.id = id;
   }
   
   public String getName(){
     return name;
   }
   public void setName(String name){
     this.name = name;
   }
   
   public String getWriterName(){
     return writerName;
   }
   public void setWriterName(String writerName){
    this.writerName = writerName;
   }
   
   public int getWrittenIn(){
     return writtenIn;
   }
   public void setWrittenIn(int writtenIn){
     this.writtenIn = writtenIn;
   }
   
   public gainKnowledge(){
      System.out.println("Reading Novels helps to get Knowledge");
   }
}