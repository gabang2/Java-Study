package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "김가영");
		library[1] = new Book("태백산맥1", "김가영");
		library[2] = new Book("태백산맥1", "김가영");
		library[3] = new Book("태백산맥1", "김가영");
		library[4] = new Book("태백산맥1", "김가영");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		// 깊은 복사
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		// 얕은 복사(밑의 주석을 풀기)
		// System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		// 얕은 복사의 경우, 복사한 copyLibrary도 값이 변경되느 것을 알 수 있음.
		library[0].setAuthor("가방이");
		library[0].setTitle("가방이의 블로그");
		
		for(Book book:library) {
			System.out.println(book);
			book.showInfo();
		}
		System.out.println("===============");
		
		for(Book book:copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		// 주소만 복사한 것임을 알 수 있음 - shallow copy(얕은 복사)
		// 갑을 복사하려면 깊은 복사를 해야함.
	}

}
