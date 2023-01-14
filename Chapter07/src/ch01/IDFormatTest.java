package ch01;

public class IDFormatTest {
	
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("8자 미만, 20자 이상은 아이디일 수 없습니다.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String id = null;
		try { // 실행 x
			test.setUserID("ddddddd");
		} catch (IDFormatException e) { // 실행
			System.out.println(e);
		}
		try { // 실행
			test.setUserID("ddddddddd");
		} catch (IDFormatException e) { // 실행 x
			System.out.println(e);
		}
	}

}
