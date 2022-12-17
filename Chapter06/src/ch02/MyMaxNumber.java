package ch02;


@FunctionalInterface // 람다형 인터페이스라고 명시함
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	// void add(int x, int y); // 함수형 인터페이스는 메서드를 두 개 이상 쓸 수 없음.

}
