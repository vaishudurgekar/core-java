public class OrderDTO{

    public OrderDTO(){
	   System.out.println("OrderDTO const is called");
	}
	
	     private int id;
		 private String name;
		 private int no;
		 
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
	 public int getNo(){
	    return no;
	 }
	 public void setNo(int no){
	   this.no = no;
	 }

}