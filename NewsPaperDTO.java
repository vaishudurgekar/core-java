public class NewsPaperDTO{

    public NewsPaperDTO(){
	}
   
    private int id;
	private String name;
	
	
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
	
	public void toRead(){
	  System.out.println("To Read");
	}
}