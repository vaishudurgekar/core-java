class Swap1 {
 
    public static void main(String[] args) {
         
         
        int x = 20, y=30;
         
        System.out.println("before the value " +x); 
         
        x = x + y;      
        y = x - y;      
        x = x - y;
        
        System.out.println("after the value of" +x);
 
    }
 
}