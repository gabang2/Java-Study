package ch06;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinder3 printer = new ThreeDPrinder3();
		
		printer.setMaterial(powder);
		Powder p = (Powder)printer.getMaterial();
		System.out.println(p);
	}
}
