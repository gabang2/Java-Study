package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		// 자료형 없으면 기본으로 Object임.
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
		p.doPrinting();
	}
}
