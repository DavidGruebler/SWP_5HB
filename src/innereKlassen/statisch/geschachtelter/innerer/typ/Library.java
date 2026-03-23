package innereKlassen.statisch.geschachtelter.innerer.typ;

public class Library {
	
	 private static String name = "Sadtbibliothek";
	
	public static class Book{
			
		public void showLibrary() {
			System.out.println(Library.name);
		}
	}
	
	public static void main(String[] args) {
        Library.Book buch = new Library.Book();
        buch.showLibrary();
	}
}
