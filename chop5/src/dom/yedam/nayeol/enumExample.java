package dom.yedam.nayeol;

import java.util.Calendar;

public class enumExample {

	public static void main(String[] args) {
		//week 타입의 today 변수
		//today는 Week가 가지고 있는 데이터만 가질 수 있다.
		//today 데이터 범위는 week
		Week today = null;
		
		//오늘의 요일
		Calendar cal = Calendar.getInstance();
		//일요일 = 1 월요일 =2 ... 금요일 = 6
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.;
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}
		
		
	}

}
