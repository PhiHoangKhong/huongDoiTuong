public class java31 {
	private int day, month, year;

	public java31(int ngay, int thang, int nam) {
		this.day = ngay;
		this.month = thang;
		this.year = nam;
	}

	public void printDay() {
		System.out.println("Day: " + this.day);
	}

	public void printMonth() {
		System.out.println("Month: " + this.month);
	}

	public void printYear() {
		System.out.println("Year: " + this.year);
	}

	public void printDate() {
		System.out.println("Date: " + this.day + " - " + this.month + " - " + this.year);
	}

}
