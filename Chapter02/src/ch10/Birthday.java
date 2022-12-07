package ch10;

public class Birthday {
	 private int day;
	 private int month;
	 private int year;
	 
	 private boolean isValid; // default값 false
	 
	 // eclipse 기능 중 오른쪽 키 -> source -> Generate getters and setters 기능 있음
	 public int getDay() {
		 return day;
	 }
	 
	 public void setDay(int day) {
		 this.day = day;
	 }

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
			isValid = true;
		}
		
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	public boolean getIsValid() { // read-only 속성
		return isValid;
	}
}