class MusicPlayerTester{

   public static void main(String[] args){
   
     MusicPlayerDTO music = new MusicPlayerDTO();
	 music.setId(1);
	 music.setName("Spotify");
	 
	 
	 System.out.println(music.getId()+ " " +music.getName());
	 
	 music.timePass();
   
   }

}