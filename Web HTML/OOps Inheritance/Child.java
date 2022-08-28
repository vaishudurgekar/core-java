class Child extends Parent{


    @Override  //Anotation- to make 
    void m(){
	  System.out.println(" from Child");
	}

}


//all the static member will hidden in child- why we cant override static in parent 
//cannot override static data whereas can overload static data
//share to difffent object but cannot different class


//@Override documentation
//diff btw Override and Overload
