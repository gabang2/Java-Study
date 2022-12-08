package ch23;

import java.util.ArrayList; // ctrl + shilft + o 하면 자동으로 해줌

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// library에 대해서 자세히 알고싶을 때는 클릭 -> F1누르면 됨
		ArrayList<Book> library = new ArrayList<>(); 
		
		// default로 10개를 잡음 - 자동으로 늘려줌
		library.add(new Book("태백산맥1", "김가영1"));
		library.add(new Book("태백산맥2", "김가영2"));
		library.add(new Book("태백산맥3", "김가영3"));
		library.add(new Book("태백산맥4", "김가영4"));
		library.add(new Book("태백산맥5", "김가영5"));
		
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}

}
