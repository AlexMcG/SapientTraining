package mainpack;

class MyDate {
	int day;
	int month;
	int year;
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	public MyDate addDays(int days) {
		MyDate ret = new MyDate(this);
		ret.day += days;
		return ret;
	}
	
	@Override
	public String toString() {
		String str = this.month + "/" + this.day + "/" + this.year;
		return str;
	}
}
public class TestMyDate {
	public static void main(String[] args) {
		MyDate my_birth = new MyDate(22, 7, 1964);
		MyDate the_next_week = my_birth.addDays(7);
		
		System.out.println(the_next_week);
	}
}
