package ch15;

public class PersonTransTest {
	public static void main(String[] args) {
		Person person1 = new Person("Edward", 20000);
		Taxi taxi = new Taxi("잘 간다 운수");
		
		person1.takeTaxi(taxi);
		person1.personInfo();
		taxi.taxiInfo();
	}
}
