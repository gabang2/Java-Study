package ch01;

public class IDFormatTest {
	
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("8�� �̸�, 20�� �̻��� ���̵��� �� �����ϴ�.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String id = null;
		try { // ���� x
			test.setUserID("ddddddd");
		} catch (IDFormatException e) { // ����
			System.out.println(e);
		}
		try { // ����
			test.setUserID("ddddddddd");
		} catch (IDFormatException e) { // ���� x
			System.out.println(e);
		}
	}

}
