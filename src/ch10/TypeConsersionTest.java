package ch10;

public class TypeConsersionTest {

	public static void main(String[] args) {

		// 묵시적 형변환
		byte bNum = 125;
		int iNum = bNum;
		System.out.println(iNum);
		
		// 암시적 형변환(변수 캐스팅 과정)
		int iNum2 = 255;
		byte bNum2 = (byte)iNum2; // 127이상을 가질 수 없기 때문에 -1으로 저장됨
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		System.out.println(iNum3);
		
		// 암시적 형변환(변수 캐스팅 과정)
		double dNum2 = 1.2;
		float fNum = 0.9F;
		int iNum4 = (int)dNum2 + (int)fNum;
		int iNum5 = (int)(dNum2 + fNum);
		System.out.println(iNum4);
		System.out.println(iNum5);
	}

}
