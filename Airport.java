public class Airport{

  public Airport(){
  }
  
  private int id;
  public String name;
  public String location;
  private int postalCode;
  
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
	
	public String getLocation(){
	  return location;
	}
	public void setLocation(String location){
	  this.location = location;
	}
	
	public int getPostalCode(){
	  return postalCode;
	}
	public void setPostalCode(int postalCode){
	  this.postalCode = postalCode;
	}
	
	public void traveling(){
	  System.out.println("To travel one place to another place");
	}

}