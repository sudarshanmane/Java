import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Book> booksCollection =  new ArrayList<>();
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		
		
		Library pl = new Library();
		for(Book bk : booksCollection) {
			
			
		    pl.addBooks(bk);
		    
		}
		
        for(Book bks : pl.s1) {	
        	
        	System.out.println("Book { bookId = "+ bks.getBookId() + " bookName = "  +bks.getBookName() + " author = "+ bks.getAuthor() + "}" );

        }
        }
 		
		
}
