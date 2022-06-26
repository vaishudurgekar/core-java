class TubeLightTester{
  
  public static void main(String a[]){
  
  TubeLight tube = new TubeLight();
  tube.colour = "White";
  tube.length = "610 mm";
  tube.price = 784;
  tube.type = "LED";
   System.out.println(tube.price+ "  " +tube.length+ "  " +tube.colour+ "  " +tube.type);
   
  }
}