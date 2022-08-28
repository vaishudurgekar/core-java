interface LibraryInf{

     void Library(int size);
    boolean createBook(BookDTO dto);
	void getBookDetails();
	void getBookNameById(int id);
	void getAllBooksName();
	boolean updateBookNameById(int id, String name);
	boolean deleteBookById(int id);
	boolean deletBookByAuthor(String author);
	

}