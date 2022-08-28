public class BookDTO{

    public BookDTO(){
	   System.out.println("BookDTO const is called");
	}
	
	   private int id;
	   private String name;
	   private String authorName;
	   private int publishedIn;

	 public int getId(){
	   return id;
	 }
	 public void setId(int id){
	   this.id = id;
	 }
	 
	 public String getName(){
	   return name;
	 }
	 public void setName(String name){
	   this.name = name;
	 }
	 
	 public int getAuthorName(){
		 return authorName;
	 }
	 public void setAuthorName(String authorName){
		 this.authorName = authorName;
	 }
	 
	 public int getPublishedIn(){
		 return publishedIn;
	 }
	 public void setPublishedIn(int publishedIn){
		 this.publishedIn = publishedIn;
	 }
}