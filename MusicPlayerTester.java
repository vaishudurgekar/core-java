class MusicPlayerTester{

   public static void main(String[] args){
   
     MusicPlayer music = new MusicPlayer();
	 music.setId(1);
	 music.setName("Spotify");
	 
	 
	 System.out.println(music.getId()+ " " +music.getName());
	 
	 music.timePass();
   
   }

}