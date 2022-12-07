package ch08;

public class Person {
	int cm;
	int kg;
	String gender;
	String name;
	int age;
	
	public Person(int cm, int kg, String gender, String name, int age){
		this.cm = cm;
		this.kg = kg;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println("키가" + cm + "이고 몸무게가 " + kg + "인 " + gender +"가 있습니다. 이름은" + name + "이고 나이는" + age + "입니다.");
	}
	
}
