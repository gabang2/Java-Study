package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
		String str = new String("test");
		System.out.println(str.toString()); // 얘는 주소 말고 문자열이 나온다. toString이 재정의 되어있기 때문이다.
	}

}
