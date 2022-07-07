class PatientDTO{
  
    public PatientDTO(){
       System.out.println("PatientDTO const is called");
    }
  
        private int id;
        private String name;  
        private String address;
        private Gender gender;  // help of enum will stored as const , - enum used as references
        private long contactNo;
        private int age;
	
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
  
     public String getAddress(){
       return address;
     }
     public void setAddress(String address){
         this.address = address;
     }
  
     public Gender getGender(){
       return gender;
     }
     public void setGender(Gender gender){
        this.gender = gender;
     }
  
     public long getContactNo(){
        return contactNo;
     }
     public void setContactNo(long contactNo){
        this.contactNo = contactNo;
     }
      public int getAge(){
	    return age;
      }
      public void setAge(int age){
	    this.age = age;
      }
  
}