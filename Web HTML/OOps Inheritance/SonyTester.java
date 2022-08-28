class SonyTester{

 public static void main(String a[]){
   Sony sony = new Sony();
   sony.ceo = "Mitsuya Kishida";
   sony.owner = "Sony corporation";
   sony.founder = "Ericsson";
   sony.operatingSystem = "Sony Ericsson OS";
   
   System.out.println(sony.ceo+ "  " +sony.owner+ "  " +sony.founder+ "  " +sony.operatingSystem);
 }
}